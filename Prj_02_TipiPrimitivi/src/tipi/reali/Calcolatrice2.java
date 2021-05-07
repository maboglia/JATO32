package tipi.reali;

import java.util.Scanner;

public class Calcolatrice2 {

	public static void main(String[] args) {
		double op1 = chiediNumero("Inserisci il primo operando");
		double op2 = chiediNumero("Inserisci il secondo operando");

	}

	private static double chiediNumero(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		return sc.nextDouble();
	}

	
	
	
	
	
}

