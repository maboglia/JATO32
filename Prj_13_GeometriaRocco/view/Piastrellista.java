package view;

import java.util.Scanner;

import model.Rettangolo;
import model.Segmento;

public class Piastrellista {
	public static void main(String[] args) {
		double superficie = 225;
		Scanner sc = new Scanner(System.in);
		double totale = 0;
		String forma = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci la forma della stanza: (r, q, t) ");
			forma = sc.nextLine();
			switch (forma) {
			case "r":
				System.out.println("Inserisci la base: ");
				double base = sc.nextDouble();
				sc.nextLine();
				System.out.println("Inserisci altezza: ");
				double altezza = sc.nextDouble();
				sc.nextLine();
				
				break;

			default:
				break;
			}
			System.out.println("Inserisci le dimensioni: ");
			
			
			
		}
		
	}
}
