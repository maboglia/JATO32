package controller;

import model.Bevanda;
import model.Ordine;
import model.Pizza;

public class OrdineCtrl {

	private Ordine ordine;
	
	public Ordine nuovoOrdine() {
		this.ordine = new Ordine();
		return this.ordine;
	}
	
	public void addPizza(String nome, double prezzo) {
		Pizza p = new Pizza(nome, prezzo);
		ordine.getPizze().add(p);
	}

	public void addBevanda(String nome, double prezzo) {
		Bevanda b = new Bevanda(nome, prezzo);
		ordine.getBevande().add(b);
	}
	
	
	public Ordine chiudiOrdine() {
		ordine.getPrezzoTotale();
		return this.ordine;
	}
	
}
