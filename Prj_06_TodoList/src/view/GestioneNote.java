package view;

import java.util.Scanner;

import controller.Pagina;
import controller.Taccuino;

public class GestioneNote {

	static String[] voci = {"1) aggiungi pagina",
			"2) stampa pagina", "3) aggiungi nota", "4) completa nota", "5) stampa nota", "0) esci"};
	
	//quaderno ad anelli che rappresenta il mio taccuino
	static Taccuino t = new Taccuino();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		menu();
		
		
		int scelta = 0;
		boolean gira = true;
		
		while(gira) {
			menu();
			scelta = sc.nextInt();
			
			switch (scelta) {
			case 1:
				//aggiungi pagina
				
				
				System.out.println("add pagina");
				System.out.println("La pagina sarà inserita alla posizione?");
				int pNum = sc.nextInt();
				t.addPagina(pNum, new Pagina());
				
				
				break;
			case 2:
				//stampa pagina
				System.out.println("stampa");
				System.out.println("Quale pagina vuoi stampare?");
				int pStamp = sc.nextInt();
				Pagina pagina = t.getPagina(pStamp);
				System.out.println(pagina.stampaPagina());
				break;				
			case 3:
				//aggiungi nota
				System.out.println("add nota");
				
				System.out.println("In quale pagina vuoi inserire la nota?");
				int nPagina = sc.nextInt();//5
				
				String desc = aggiungiNota(sc);
				
				System.out.println("In quale posizione della pagina vuoi inserire questa nota?");
				int posNota = sc.nextInt();
				
				t.getPagina(nPagina).addNota(posNota, desc);
				
				break;					
			case 4:
				//completa nota
				System.out.println("completa");				
				break;					
			case 5:
				//stampa nota
				System.out.println("stampa nota");
				break;					
			case 0:
				//esci
				gira = false;
				break;					
				
			
			default:
				System.out.println("scelta non disponibile, riprova!");
				menu();
				scelta = sc.nextInt();
				break;
			}//fine switch
		
		}//fine while
		
		System.out.println("arrivederci");
		
		/*
		String nota = aggiungiNota(sc);
		
		Pagina p = new Pagina();
		p.addNota(0, nota);
		
		Taccuino tRosso = new Taccuino();
		tRosso.addPagina(0, p);

		String s = tRosso//qui accedo al mio taccuino
						.getPagine()[0]// dal taccuino mi faccio dare la pagina 0
						.getNote()[0]//mi faccio dare la nota 0
								.stampaNota();//stampo la nota corrente
		System.out.println(s);
		*/
	}

	private static void menu() {
		for (int i = 0; i < voci.length; i++) {
			System.out.println(voci[i]);
		}
		
	}

	private static String aggiungiNota(Scanner sc) {
		System.out.println("Cosa scrivo nella nota?");
		String s = sc.next();
		sc.nextLine();
		return s;
	}

}
