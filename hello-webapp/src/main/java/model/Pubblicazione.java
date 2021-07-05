package model;

public abstract class Pubblicazione implements Comparable<Pubblicazione>{
	protected String titolo;
	protected double prezzo;
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
