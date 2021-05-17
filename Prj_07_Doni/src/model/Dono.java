package model;

public class Dono {

	private String nomeRegalo;
	private double prezzo;
	
	public Dono(String nomeRegalo, double prezzo) {
		this.nomeRegalo = nomeRegalo;
		this.prezzo = prezzo;
	}

	public String getNomeRegalo() {
		return nomeRegalo.toUpperCase();
	}

	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public String toString() {
		return "Dono [nomeRegalo=" + nomeRegalo + ", prezzo=" + prezzo + "]";
	}

	
	
	
}
