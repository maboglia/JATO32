package controller;

import model.Dono;

public class DonoCtrl {

	Dono[] doni;
	
	public DonoCtrl() {
		this.doni = new Dono[30];
	}
	
	public void aggiungiDono(String nome, double prezzo) {
		int i = trovaPosizioneLibera();
		if ( i != -1) {
			doni[i] = new Dono(nome, prezzo);
			System.out.println("Dono inserito correttamente alla posizione " + i);
		} else {
			System.out.println("Tutte le posizioni sono occupate, dono non creato!");
		}
	}
	
	private int trovaPosizioneLibera() {
		
		for (int i = 0; i < doni.length; i++) {
			if (doni[i] == null) {
				return i;//ho trovato una posizione libera nel contenitore e la ritorno
			}
		}
		return -1;
	}
	
	public void stampaContenuto() {
		//uso il foreach
		for (Dono dono : doni) {
			if (dono != null)
			System.out.println(dono);
		}
	}
	
	public double valoreDoni() {
		double totale = 0;
		for (Dono dono : doni) {
			if (dono != null)
			totale += dono.getPrezzo();
		}
		return totale;
	}
	
}
