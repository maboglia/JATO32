package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Registro2 - Si tratta di un'evoluzione della classe Registro
 * 
 * @author mauro
 *
 */
public class Registro2 {

	private Studente[] studenti;//resta un array scalare
	private ArrayList<Studente> presenti;//trasformati in arraylist
	private ArrayList<Studente> assenti;
	
	private String descrizione;
	
	public Registro2(Studente[] studenti) {
		this.studenti = studenti;
		int i = studenti.length;
		this.presenti = new ArrayList<>();
		this.assenti = new ArrayList<>();
		
	}
	
	public void faiAppello() {
		Scanner sc = new Scanner(System.in);
		String risposta = null;
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente: ");
			System.out.println(studente);
			risposta = sc.next();
			if (risposta.equalsIgnoreCase("n")) {
				this.assenti.add(studente);
			} else {
				this.presenti.add(studente);				
			}
		}
		
	}//fine faiAppello
	

	public void stampaTutti() {
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}
	
	public void stampaPresenti() {
		for (Studente studente : presenti) {
			//if (studente != null)
			System.out.println(studente);
		}
	}

	public void stampaAssenti() {
		for (Studente studente : assenti) {
			//if (studente != null)
			System.out.println(studente);
		}
	}
	
	public void ordina() {
		//devo seguire una logica:
		//1 setto una variabile boolean, scorrere l'elenco
		boolean guardia = false;

		for (int i = 0; i < studenti.length; i++) {
			if (i < studenti.length -1) {
				Studente corrente = studenti[i];
				Studente successivo = studenti[i+1];
				//2 confrontare una proprietà di ciascuno, p.es cognome a due 
				int test = corrente.getCognome().compareTo(successivo.getCognome());
				if (test > 0) {
					//4 se non sono in ordine scambio i 2 studenti, quindi modifico il valore boolean
					System.out.println("devi fare un altro giro");
					//System.out.println(corrente.getCognome());
					//System.out.println("con");
					//System.out.println(successivo.getCognome());
					Studente temp = corrente;
					studenti[i] = successivo;
					studenti[i+1] = temp;
				}
				//3 se li trovo già in ordine lascio così
				//System.out.println("dato il cognome " + corrente.getCognome());
				//System.out.println("dato il cognome " + successivo.getCognome());
				//System.out.println("Il risultato del test è: " + test);
				
			}
			//5 mi sposto alla coppia successiva
		}
		//6 finche arrivo all'ultima, quindi esco
		//ripeto questo ciclo finché una var boolean mi dice che è tutto ordinato
	}
	
	
}
