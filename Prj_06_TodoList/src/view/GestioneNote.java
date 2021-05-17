package view;

import java.util.Scanner;

import controller.Pagina;
import controller.Taccuino;

public class GestioneNote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nota = aggiungiNota(sc);
		
		Pagina p = new Pagina();
		p.addNota(0, nota);
		
		Taccuino tRosso =new Taccuino();
		tRosso.addPagina(0, p);

		String s = tRosso.getPagina(0).getNote()[0].stampaNota();
		System.out.println(s);
	}

	private static String aggiungiNota(Scanner sc) {
		System.out.println("Cosa scrivo nella nota?");
		return sc.nextLine();
	}

}
