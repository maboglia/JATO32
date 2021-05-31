package controller;

import model.Libreria;
import model.Libro;
import model.Ripiano;
import model.Scaffale;

public class LibreriaCtrl {

	private Libreria libreria;

	public LibreriaCtrl() {
		this.libreria = new Libreria();
	}

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}
	public void addLibro(Libro l, Ripiano r) {
		r.getLibri().add(l);
	}
	public Libro creaLibro(String titolo, int pagine) {
		Libro l = new Libro(titolo, pagine);
		return l;
		
	}
	public void addRipiano(int i) {
		this.libreria.getScaffali().get(i).getRipiani().add(new Ripiano());
	}
	public void addScaffale() {
		this.libreria.getScaffali().add(new Scaffale());
	}
}
