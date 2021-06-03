package view;

import controller.CDLController;
import model.Esame;
import model.Studente;

public class GestioneCDL {
	public static void main(String[] args) {
		CDLController c = new CDLController("Corso informatica");
		c.immatricola("Pippo");
		c.immatricola("Paperino");
		
		Esame e = c.cdl.getStudentiIscritti().get(0).getEsamiDare().get(0);
		Studente s = c.cdl.getStudentiIscritti().get(0);
		
		c.daiEsame(s, e);
		
		System.out.println(s);
		
	}
}
