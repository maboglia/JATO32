package model;

public class Libro {

	private String  titolo;
	private double prezzo;
	
	
	public Libro(String titolo, double prezzo) {
		super();
		this.titolo = titolo;
		this.prezzo = prezzo;
	}


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


	@Override
	public String toString() {
		return "{\"titolo\":\"" + titolo + "\", \"prezzo\":" + prezzo + "}";
			  // ^ inserisco \ per usare le " dentro la stringa
	}
	
	
	
	
}
