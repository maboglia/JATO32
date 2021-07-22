package model;

import java.util.ArrayList;
import java.util.List;



public class Pizza implements Comparable<Pizza>{

	public class Ingrediente {
		String nome;
		double quantita;
		double prezzo;
		public Ingrediente(String nome, double quantita, double prezzo) {
			this.nome = nome;
			this.quantita = quantita;
			this.prezzo = prezzo;
		}
		public String getNome() {
			return nome;
		}
		@Override
		public String toString() {
			return "Ingrediente [nome=" + nome + ", quantita=" + quantita + "]";
		}
	}

	private static int contaPizze=0;
	private int idPizza;
	private String nome;
	
	public void addIngrediente(String nome) {
		Ingrediente i = new Ingrediente(nome, 0, 0);
		this.ingredienti.add(i);
	} 
	
	public boolean trovaIngrediente(String i) {
		
		for (int j = 0; j < this.ingredienti.size(); j++) {
			if (this.ingredienti.get(j).nome.equals(i)) {
				return true;
			}
			
		}
		return false;
	}
	
	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public static int getContaPizze() {
		return contaPizze;
	}

	private double prezzo;
	private List<Ingrediente> ingredienti = new ArrayList<>();
	
	public Pizza() {
		this.idPizza=contaPizze++;
	}
	
	public Pizza(String nome, double prezzo) {
		this();
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Ingrediente> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<Ingrediente> ingredienti) {
		this.ingredienti = ingredienti;
	}

	@Override
	public String toString() {
		return "Pizza [nome=" + nome + ", prezzo=" + prezzo + ", ingredienti=" + ingredienti + "]"+this.idPizza;
	}

	@Override
	public int compareTo(Pizza altra) {
		return this.nome.compareTo(altra.nome);
	}
}

