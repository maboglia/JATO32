package model;

public class Persona implements Comparable<Persona>{

	private String nome;
	private int eta;
	private boolean disponibile;
	
	public Persona(String nome, int eta, boolean disponibile) {
		this.nome = nome;
		this.eta = eta;
		this.disponibile = disponibile;
		System.out.println(super.getClass().getSimpleName());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", disponibile=" + disponibile + "]";
	}

	@Override
	public int compareTo(Persona o) {
		// confronto il nome dell'oggetto corrente con il nome dell'oggetto passato in argomento: o
		return this.nome.compareTo(o.nome);
	}
	
	
	
}
