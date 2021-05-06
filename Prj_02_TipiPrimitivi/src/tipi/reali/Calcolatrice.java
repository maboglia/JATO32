package tipi.reali;

import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il primo operando");
		double op1 = sc.nextDouble();

		System.out.println("Inserisci il secondo operando");
		double op2 = sc.nextDouble();
		
		System.out.println("quale operazione vuoi fare tra " + op1 +" e " + op2);
		String operazione = sc.next();
		
		//sto forzando un 'a capo'
		sc.nextLine();
		
		if (operazione.equals("+")) {
			System.out.println(op1 + op2);
		} 
		else if (operazione.equals("-")) {
			System.out.println(op1 - op2);
		} 
		else if (operazione.equals("*")) {
			System.out.println(op1 * op2);
		} 
		else if (operazione.equals("/")) {
			System.out.println(op1 / op2);
		} 
		else {
			System.out.println("Operazione NON disponibile!");
		}
		
		 
		
		
	}

}
