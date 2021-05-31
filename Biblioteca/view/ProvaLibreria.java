package view;

import controller.LibreriaCtrl;
import model.*;

public class ProvaLibreria {

	public static void main(String[] args) {

		LibreriaCtrl ctrl = new LibreriaCtrl();
		ctrl.addScaffale();//aggiunto uno scaffale. Scaffale 0
		Scaffale scaffale = ctrl.getLibreria().getScaffali().get(0);//Mi faccio tornare lo scaffale appena costrutito.
		ctrl.addRipiano(0);//aggiunto un ripiano, ripiano 0.
		ctrl.addRipiano(0);//aggiunto un ripiano, ripiano 1.
		Ripiano r1 = scaffale.getRipiani().get(0);
		Ripiano r2 = scaffale.getRipiani().get(1);
		Libro l1 = ctrl.creaLibro("The Shining", 500);
		Libro l2 = ctrl.creaLibro("Green mile", 231);
		Libro l3 = ctrl.creaLibro("1929", 329);
		Libro l4 = ctrl.creaLibro("IT", 1230);
		ctrl.addLibro(l1, r1);
		ctrl.addLibro(l2, r2);
		ctrl.addLibro(l3, r1);
		ctrl.addLibro(l4, r2);
		for (Libro l : r1.getLibri()) {
			System.out.println(l);
		}
		System.out.println(r2.getLibri());
	}

}
