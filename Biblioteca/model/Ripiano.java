package model;

import java.util.ArrayList;

public class Ripiano {

	private ArrayList<Libro> libri;

	public Ripiano() {
		this.libri = new ArrayList<>();
		System.out.println("Ripiano creato!");
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
	}
}
