package view;

import controller.Argomenti;
import model.Argomento;

public class Gestionale {

	public static void main(String[] args) {
		
		Argomento primoArgomento = new Argomento();
		primoArgomento.setTesto("operatori e tipi");

		Argomento a2 = new Argomento("variabili e costanti");

		
		Argomenti controller = new Argomenti();
		
		controller.getCollezione()[0] = primoArgomento;
		controller.getCollezione()[1] = a2;

		for (Argomento a : controller.getCollezione()) {
			if (a != null) {
				System.out.println(a.getTesto());
			}
		}
		
		
	}

}
