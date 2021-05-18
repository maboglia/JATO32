package view;

import controller.Argomenti;
import model.Argomento;

public class Gestionale {

	public static void main(String[] args) {
		
		Argomento a1 = new Argomento();

		Argomento a2 = new Argomento();

		a1.setTesto("operatori e tipi");
		a2.setTesto("variabili e costanti");
		
		Argomenti controller = new Argomenti();
		
		controller.getCollezione()[0] = a1;
		controller.getCollezione()[1] = a2;

		for (Argomento a : controller.getCollezione()) {
			if (a != null) {
				System.out.println(a.getTesto());
			}
		}
		
		
	}

}
