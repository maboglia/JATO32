package com.generation.hello.model;

public class Libro {

	private String titolo;
	private int pagine;
	
	
	
	public Libro() {}
	
	public Libro(String titolo, int pagine) {
		this.titolo = titolo;
		this.pagine = pagine;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	
	
	
	
}
