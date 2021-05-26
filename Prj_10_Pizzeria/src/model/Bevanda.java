package model;

public class Bevanda {
	private String nome;
	private double prezzo;
	
	public Bevanda(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
 
	
	
}
