package model;

public class Pizza {

	//TODO: qui aggiungere un contatore di pizze prodotte
	
	private String nome;
	private double prezzo;
	
	public Pizza(String nome, double prezzo) {
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
		return "Pizza [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
}
