package tipi.interi;

import java.util.Scanner;

public class Rettangolo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci un valore intero per la base: ");
		
		int base = input.nextInt();
		System.out.println("inserisci un valore intero per l'altezza: ");

		int altezza = input.nextInt();
		
		System.out.println("Dato un rettangolo di base: " + base);
		System.out.println("e di altezza: " + altezza);

		int superficie = base * altezza;
		
		System.out.println("La superficie del rettangolo è: " + superficie);
		

	}

}
