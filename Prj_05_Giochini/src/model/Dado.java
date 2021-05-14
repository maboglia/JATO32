package model;

import java.util.Random;

public class Dado {

	//incapsulamento
	private byte nFacce;
	private String colore;
	private byte faccia;
	
	//new Dado(6, "rosso");new Dado(6, "bianco");
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
