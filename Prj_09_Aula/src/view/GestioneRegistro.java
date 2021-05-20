package view;

import database.DBStudenti;
import model.Registro;

public class GestioneRegistro {

	public static void main(String[] args) {
		
		Registro r = new Registro(DBStudenti.studenti);
		
		r.faiAppello();
		
		r.stampaPresenti();
		
		r.stampaAssenti();

	}

}
