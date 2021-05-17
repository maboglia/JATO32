package controller;

import model.Nota;

public class Pagina {
	
	//array di Nota, proprieta della classe Pagina
	private Nota[] note;
	
	public Pagina() {
		this.note = new Nota[10];
	}
	
	public void addNota(int posizione, String descrizione) {
		//creo un nuovo oggetto di tipo Nota
		Nota n = new Nota(descrizione);
		//aggiungo l'oggetto n all'array di note, nella posizione indicata
		this.note[posizione] = n;
	}

	//getter della prop note
	public Nota[] getNote() {
		return this.note;
	}
	
	
	
}
