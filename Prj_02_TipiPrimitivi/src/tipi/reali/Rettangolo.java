package tipi.reali;

import java.util.Scanner;

public class Rettangolo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String nome = scanner.nextLine();
		
		System.out.println("Quanto è larga la tua stanza in metri?");
		double larghezza = scanner.nextDouble();

		System.out.println("Quanto è lunga la tua stanza in metri?");
		double lunghezza = scanner.nextDouble();
		
		double superficie = larghezza * lunghezza;
		
		System.out.println("Benvenuto " + nome + ", la superficie complessiva è: " + superficie );
		
		
		
	
	}

}
