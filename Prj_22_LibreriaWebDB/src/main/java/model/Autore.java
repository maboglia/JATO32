package model;

public class Autore {

	private int id;
	private String nome, cognome, nazionalita;
	
	
	public Autore() {
	}
	
	public Autore(int id, String nome, String cognome, String nazionalita) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.nazionalita = nazionalita;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNazionalita() {
		return nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
	@Override
	public String toString() {
		return "Autore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", nazionalita=" + nazionalita + "]";
	}
	
	
	
	
}
