package view;

import java.util.Scanner;

public class CartaForbiciSasso {

	static String[] possibilita = {"carta", "forbici", "sasso"};
	static int vittorieUMANO = 0;
	static int vittoriePC = 0;
	
	
	public static void main(String[] args) {
	
		final int CICLI = 100000;
		String umano;
		String pc;
		String result;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < CICLI; i++) {
//			umano = sceltaUmano();
			umano = sceltaPC();
			pc = sceltaPC();
			result = confronta(umano, pc);
			System.out.println("Risultato: " + result);
		}
		long stop = System.currentTimeMillis();
		System.out.println("Vittorie dell'umano: " + vittorieUMANO);
		System.out.println("Vittorie del pc: " + vittoriePC);
		System.out.println("L'elaborazione è durata: " + (stop - start));
		

	}

	private static String confronta(String umano, String pc) {

		String risposta = "pareggio";
		
		if(!umano.equals(pc)) {
			//logica binaria
			switch (umano) {
			case "carta":
				if (pc.equals("forbici")) { risposta = "vince PC"; vittoriePC++;}
				else {risposta = "vince UMANO";vittorieUMANO++;}
				break;
			case "forbici":
				if (pc.equals("sasso")) { risposta = "vince PC"; vittoriePC++;}
				else {risposta = "vince UMANO";vittorieUMANO++;}
				break;
			case "sasso":
				if (pc.equals("carta")) { risposta = "vince PC"; vittoriePC++;}
				else {risposta = "vince UMANO";vittorieUMANO++;}
				break;
			}
		}
		
		return risposta;
	}

	private static String sceltaPC() {
		int scelta;
		scelta = (int)(Math.random() * possibilita.length);
		return possibilita[scelta];
	}

	private static String sceltaUmano() {
		System.out.println("Scegli tra:");
		for (int i = 0; i < possibilita.length; i++) {
			System.out.println(i + " per " + possibilita[i]);
		}
		Scanner sc = new Scanner(System.in);
		int scelta = sc.nextInt();
		
		if (scelta == 0 || scelta == 1 || scelta == 2) {
			return possibilita[scelta];
		}
		sc.close();
		return null;
	}

	
	
}
