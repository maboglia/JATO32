package model;

import java.util.Scanner;

public class Registro {

	private Studente[] studenti;
	private Studente[] presenti;
	private Studente[] assenti;
	
	private String descrizione;
	
	public Registro(Studente[] studenti) {
		this.studenti = studenti;
		int i = studenti.length;
		this.presenti = new Studente[i];
		this.assenti = new Studente[i];
		
	}
	
	public void faiAppello() {
		Scanner sc = new Scanner(System.in);
		String risposta = null;
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente: ");
			System.out.println(studente);
			risposta = sc.next();
			if (risposta.equalsIgnoreCase("n")) {
				int pos = trovaPosizioneLibera(this.assenti);
				this.assenti[pos] = studente;
			} else {
				int pos = trovaPosizioneLibera(this.presenti);
				this.presenti[pos] = studente;				
			}
		}
		
	}//fine faiAppello
	
	private int trovaPosizioneLibera(Studente[] elenco) {
		
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i] == null) {
				return i;//ho trovato una posizione libera nel contenitore e la ritorno
			}
		}
		return -1;
	}
	
	public void stampaTutti() {
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}
	
	public void stampaPresenti() {
		for (Studente studente : presenti) {
			if (studente != null)
			System.out.println(studente);
		}
	}

	public void stampaAssenti() {
		for (Studente studente : assenti) {
			if (studente != null)
			System.out.println(studente);
		}
	}
	
}
