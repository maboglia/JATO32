package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ordine {

	//appartiene alla classe - variabile di classe
	private static int contatore = 1;
	
	//variabili di istanza - appartengono agli oggetti
	private ArrayList<Pizza> pizze;
	private ArrayList<Bevanda> bevande;
	private int numOrdine;
	private double prezzoTotale;
	private LocalDateTime dataOrdine;
	
	public Ordine() {
		this.pizze = new ArrayList<>();
		this.bevande = new ArrayList<>();
		this.prezzoTotale = 0;
		this.numOrdine = contatore++;
		this.dataOrdine = LocalDateTime.now();
	}

	public ArrayList<Bevanda> getBevande() {
		return bevande;
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
		for (Bevanda b : bevande) {
			tot += b.getPrezzo();
		}

		this.prezzoTotale = tot;
		
		return prezzoTotale;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Ordine n.ro: " + numOrdine);
		sb.append("\n");
		sb.append("Data ordine: " + dataOrdine);
		sb.append("\n");
		
		for (Pizza pizza : pizze) {
			sb.append(pizza + "\n");
		}
		
		for (Bevanda b : bevande) {
			sb.append(b + "\n");
		}
		
		
		
		sb.append("Il totale dell'ordine: " + getPrezzoTotale());
		
		return sb.toString();
	}
	
	
}
