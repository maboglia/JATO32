package principale;

import java.util.Scanner;

public class Pizza {
		
		//proprietà, fields,attributi
		
		static String pizza1 = "margherita";
		static String pizza2 = "pizza giancarlo: ananas, patatine, mozza";
		static String pizza3 = "pizza prosciutto cotto";

		
		
		//questo è il metodo principale, serve per far partire il programma e organizzare il flusso di esecuzione
	public static void main(String[] args) {

		//1) qui parte il programma
		menu();
		
		//2) qui chiamo un metodo per la scelta utente
		int scelta = scegliPizza();
		
		//3) se utente sceglie tra 1 e 3 ok
		if (scelta > 0 && scelta < 4) {
			preparaPizza(scelta);
		} else {
			//altrimenti, se sceglie un intero diverso
			//TODO: qui trovare un sistema più furbo
			System.out.println("pizza non disponibile");
			menu();
		}
	
	
	}//qui finisce il main()

		private static int scegliPizza() {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}

	private static void menu() {
		System.out.println("Che pizza vuoi?");
		System.out.println("1) " + pizza1);
		System.out.println("2) " + pizza2);
		System.out.println("3) " + pizza3);
		
		System.out.println("indicare un numero per scegliere la pizza");
	}
	
	//scrivo un metodo di ausilio al main(): aiuta il main
	private static void preparaPizza(int sceltaUtente) {
		System.out.println("grazie per la scelta, stiamo preparando la sua pizza...");
		
		if (sceltaUtente==1) {
			System.out.print("è pronta la sua pizza \n");
			System.out.println(pizza1);
			System.out.println("costa 5 euro");
		}
		
		if (sceltaUtente==2) {
			System.out.print("è pronta la sua pizza \n");
			System.out.println(pizza2);
			System.out.println("costa 12 euro");
		}		
		
		if (sceltaUtente==3) {
			System.out.print("è pronta la sua pizza \n");
			System.out.println(pizza3);
			System.out.println("costa 7 euro");
		}
		
		System.out.println("buon appetito");
		
				
	}

	
	
}
