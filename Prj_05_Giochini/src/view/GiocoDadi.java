package view;

import java.util.Scanner;

import model.Dado;

public class GiocoDadi {

	
	static Dado d1 = new Dado();
	static Dado d2 = new Dado("rosso");
	static final int LANCI = 100;
	static int successi = 0;
	
	public static void main(String[] args) {
		
		boolean gira = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(gira) {
			System.out.println("A che gioco vuoi giocare?");
			System.out.println("1) stesso valore");
			System.out.println("2) somma sette");
			System.out.println("0) per uscire dal gioco");
			int i = sc.nextInt();
			if (i == 0) {
				gira = false;
				System.out.println("Arrivederci........");
				break;
			} else {
				switch(i) {
					case 1: stessoValore(); break;
					case 2: sommaSette(); break;
					default: System.out.println("Gioco non disponibile");break;
				}
			}
			mostraRisultato();
		}//fine ciclo while
		
		//stessoValore();
		//sommaSette();
		
	}

	private static void mostraRisultato() {
		double percentuale = (double) successi / LANCI * 100;
		System.out.println("******************************************");
		System.out.println("Hai lanciato " + LANCI + " volte");
		System.out.println("Hai vinto " + successi + " volte");
		System.out.println("La precentuale di successi è del " + percentuale +"%");
		System.out.println("******************************************");
	}

	private static void stessoValore() {
		System.out.println("stai giocando a stesso valore");
		for (int i = 0; i < LANCI; i++) {
			d1.lancia();
			d2.lancia();
			
			if (d1.valore() == d2.valore()) {
				successi++;
				System.out.println("è uscito il " + d1.valore());
				System.out.println("sono uguali");
			}
		}//fine for
	}
	private static void sommaSette() {
		System.out.println("stai giocando a somma sette");

		for (int i = 0; i < LANCI; i++) {
			d1.lancia();
			d2.lancia();
			
			if (d1.valore() + d2.valore() == 7 ) {
				successi++;
				System.out.println("Dado 1" + d1.valore());
				System.out.println("Dado 2" + d2.valore());
				System.out.println("SOMMA SETTE!!!!!");
			}
		}//fine for
	}
}
