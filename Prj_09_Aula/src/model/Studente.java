package model;

public class Studente {

	private String nome;
	private String cognome;
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "" + nome + ", " + cognome.toUpperCase() + "";
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	
	
}
