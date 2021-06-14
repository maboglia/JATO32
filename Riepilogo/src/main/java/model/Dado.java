package model;

import java.util.Random;

public class Dado {

	//incapsulamento
	private byte nFacce;
	private String colore;
	private byte faccia;
	
	//Overload: sovraccarico dei metodi
	//Polimorfismo: costruire oggetti dello stesso tipo, ma di forma diversa
	//new Dado(6, "rosso");new Dado(6, "bianco");

	public Dado() {
		this.nFacce = 6;
		this.colore = "bianco";
	}
	
	public Dado(String colore) {
		this.nFacce = 6;
		this.colore = colore;
	}
	public Dado(byte b) {
		this.nFacce = b;
		this.colore = "verde";
	}
	
	
	public Dado(byte numeroFacce, String coloreDado) {
		this.nFacce = numeroFacce;
		this.colore = coloreDado;
	}
	
	
	
	public void lancia() {
		Random r = new Random();
		this.faccia = (byte) (r.nextInt(this.nFacce) + 1);
	}

	public byte valore() {
		return this.faccia;
	}
	
}
