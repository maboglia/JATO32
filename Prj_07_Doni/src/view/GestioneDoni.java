package view;

import controller.DonoCtrl;

public class GestioneDoni {

	public static void main(String[] args) {
		
		DonoCtrl dc = new DonoCtrl();
		
		dc.aggiungiDono("trenino", 12.5);
		dc.aggiungiDono("pistola", 15.5);
		dc.aggiungiDono("macchinina", 2.5);
		dc.aggiungiDono("bambola", 12.4);
		dc.aggiungiDono("chupa chupa", 7.5);
		dc.aggiungiDono("game boy", 85.5);
		dc.aggiungiDono("pallone", 5.5);
		dc.aggiungiDono("lego", 12.5);
		dc.aggiungiDono("pokemon", 4.5);
		dc.aggiungiDono("bakugan", 18.5);

		
		dc.aggiungiDono("trenino", 12.5);
		dc.aggiungiDono("pistola", 15.5);
		dc.aggiungiDono("macchinina", 2.5);
		dc.aggiungiDono("bambola", 12.4);
		dc.aggiungiDono("chupa chupa", 7.5);
		dc.aggiungiDono("game boy", 85.5);
		dc.aggiungiDono("pallone", 5.5);
		dc.aggiungiDono("lego", 12.5);
		dc.aggiungiDono("pokemon", 4.5);
		dc.aggiungiDono("bakugan", 18.5);
		
		
		dc.aggiungiDono("trenino", 12.5);
		dc.aggiungiDono("pistola", 15.5);
		dc.aggiungiDono("macchinina", 2.5);
		dc.aggiungiDono("bambola", 12.4);
		dc.aggiungiDono("chupa chupa", 7.5);
		dc.aggiungiDono("game boy", 85.5);
		dc.aggiungiDono("pallone", 5.5);
		dc.aggiungiDono("lego", 12.5);
		dc.aggiungiDono("pokemon", 4.5);
		dc.aggiungiDono("bakugan", 18.5);
		
		dc.aggiungiDono("pizza", 7.5);
		dc.aggiungiDono("bicicletta", 120.5);
		
		dc.stampaContenuto();
		
		System.out.println("Il valore complessivo è: " + dc.valoreDoni());
		

	}

}
