package view;

import database.DBStudenti;
import model.Registro;

public class GestioneRegistro {

	public static void main(String[] args) {
		
		Registro r = new Registro(DBStudenti.studenti);
		
		//r.faiAppello();
		
		//r.stampaPresenti();
		
		//r.stampaAssenti();

		System.out.println("Elenco originale");
		r.stampaTutti();
		System.out.println("eseguo l'ordinamento");
		r.ordina();
		r.ordina();
		r.ordina();
		r.ordina();
		r.ordina();
		System.out.println("Elenco ordinato (1 volta)");
		r.stampaTutti();
		
	}

}
