package model;

import java.util.Random;

public class Dado {

	private int facce;
	private int valore;
	
	public int getValore() {
		return valore;
	}
	
	Random r = new Random();
	
	public Dado() {
		this.facce = 6;
		this.valore = 0;
	}
	
	public Dado(int facce) {
		this.facce = facce;
		this.valore = 0;
	}
	
	public void lancia() {
		
		if (Math.random() > 0.98)
			this.valore = 1;
		else
			this.valore = r.nextInt(facce) + 1;
	}
	
}
