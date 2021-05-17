package view;

import java.util.Scanner;

import controller.Pagina;
import controller.Taccuino;

public class GestioneNote {

	static String[] voci = {"1) aggiungi pagina",
			"2) stampa pagina", "3) aggiungi nota", "4) completa nota", "5) stampa nota", "0) esci"};
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		menu();
		int scelta = sc.nextInt();
		boolean gira = true;
		
		while(gira) {
			switch (scelta) {
			case 1:
				//aggiungi pagina
				break;
			case 2:
				//stampa pagina
				break;				
			case 3:
				//aggiungi nota
				break;					
			case 4:
				//completa nota
				break;					
			case 5:
				//stampa nota
				break;					
			case 0:
				//esci
				gira = false;
				break;					
				
			
			default:
				menu();
				scelta = sc.nextInt();
				break;
			}
			
			
		}
		
		System.out.println("arrivederci");
		
		
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
	}

	private static void menu() {
		for (int i = 0; i < voci.length; i++) {
			System.out.println(voci[i]);
		}
		
	}

	private static String aggiungiNota(Scanner sc) {
		System.out.println("Cosa scrivo nella nota?");
		return sc.nextLine();
	}

}
