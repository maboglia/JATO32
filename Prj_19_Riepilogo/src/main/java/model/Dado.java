package model;

import java.util.Random;

public class Dado {
	//incapsulamento > mettere oggetti private dentro metodi public per modificarli
	private byte nFacce;
	private String colore;
	private byte faccia;
	// ^ nonostante si possa usare byte in genere si usano int per comodità
	//   visto che di base i numeri sono considerati int
	//   e di conseguenza devo fare i (cast) ovunque
	
	//Overlaod: sovraccarico dei metodi
	//Polimorfismo: costruire oggetti dello stesso tipo ma di forma diversa
	//new Dado(6, "rosso"); new Dado(6, "bianco");
	public Dado(byte numeroFacce, String coloreDado) {
		this.nFacce = numeroFacce;
		this.colore = coloreDado;
	}
	
	public Dado() {
		this.nFacce = 6;
		this.colore = "bianco";
	}
	
	public void lancia() {
		Random r = new Random();
		this.faccia = (byte) (r.nextInt(this.nFacce) + 1);
	}			// ^ faccio il cast perché ho scelto byte
	
	public byte valore() {
		return this.faccia;
	}
	
}