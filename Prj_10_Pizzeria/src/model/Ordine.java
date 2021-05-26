package model;

import java.util.ArrayList;

public class Ordine {

	//appartiene alla classe - variabile di classe
	private static int contatore = 1;
	
	//variabili di istanza - appartengono agli oggetti
	private ArrayList<Pizza> pizze;
	private int numOrdine;
	private double prezzoTotale;
	
	public Ordine() {
		this.pizze = new ArrayList<>();
		this.prezzoTotale = 0;
		this.numOrdine = contatore++;
	}

	public ArrayList<Pizza> getPizze() {
		return pizze;
	}

	public int getNumOrdine() {
		return numOrdine;
	}

	public double getPrezzoTotale() {
		double tot = 0;
		
		for (Pizza pizza : pizze) {
			tot += pizza.getPrezzo();
		}
		this.prezzoTotale = tot;
		
		return prezzoTotale;
	}

	@Override
	public String toString() {
		return "Ordine [pizze=" + pizze + ", numOrdine=" + numOrdine + ", prezzoTotale=" + prezzoTotale + "]";
	}
	
	
}
