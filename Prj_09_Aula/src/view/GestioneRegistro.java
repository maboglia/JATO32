package view;

import database.DBStudenti;
import model.*;

public class GestioneRegistro {

	public static void main(String[] args) {
		
		Registro2 r = new Registro2(DBStudenti.studenti);
		
		r.faiAppello();
		System.out.println("-----------PRESENTI----------");
		r.stampaPresenti();
		System.out.println("-----------PRESENTI----------");
		
		r.stampaAssenti();

		System.out.println("Elenco originale");
//		r.stampaTutti();
		System.out.println("eseguo l'ordinamento");
//		r.ordina();
//		r.ordina();
//		r.ordina();
//		r.ordina();
//		r.ordina();
		System.out.println("Elenco ordinato (1 volta)");
//		r.stampaTutti();
		
	}

}
