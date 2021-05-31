package model;

import java.util.ArrayList;

public class Scaffale {

	private ArrayList<Ripiano> ripiani;

	public Scaffale() {
		this.ripiani = new ArrayList<>();
		System.out.println("Scaffale Creato!");
	}

	public ArrayList<Ripiano> getRipiani() {
		return ripiani;
	}

	public void setRipiani(ArrayList<Ripiano> ripiani) {
		this.ripiani = ripiani;
	}
}
