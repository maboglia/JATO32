package controller;

import java.util.ArrayList;

import model.Libro;

public class Libreria {

	private static ArrayList<Libro> magazzino = new ArrayList<>();
	
	public static void addLibro(String titolo, int pagine, double prezzo) {
		Libro l = new Libro(titolo, pagine, prezzo);
		magazzino.add(l);
		
	}
	
	public static void addLibro(Libro l) {
		magazzino.add(l);
	}
	
	public static ArrayList<Libro> getMagazzino(){
		return magazzino;
	}
	
	public static Libro getLibro(int index) {
		return magazzino.get(index);
	}
	
	public static Libro getLibroById(int id) {
		for (Libro libro : magazzino) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		
		return null;
	}
	
	
}
