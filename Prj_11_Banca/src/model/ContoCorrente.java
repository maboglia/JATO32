package model;

import java.util.ArrayList;

public class ContoCorrente {

	//contatore static : appartiene alla classe
	
	private static int counter = 1;
	
	private int numero;
	private double saldo;
	private ArrayList<Cliente> titolari;
	private ArrayList<Movimento> movimenti;

	public int getNumero() {
		return numero;
	}
	
	public ContoCorrente() {
		System.out.println("Genero nuovo conto corrente:");
		this.saldo = 0.0;
		this.numero = counter++;
		this.titolari = new ArrayList<>();
		this.movimenti = new ArrayList<>();
		
		System.out.println("Conto corrente " + numero + " generato!");

	}
	
	public void addTitolare(Cliente c) {
		this.titolari.add(c);
		System.out.println("Cliente " + c.getNome() + " aggiunto al conto " + this.numero);
	}
	
	public void addMovimento(Movimento m) {
		this.movimenti.add(m);
	}
	
	public void versamento(double amount) {
		Movimento m = new Movimento("Versamento", amount);
		this.addMovimento(m);
		this.saldo += amount;
	}
	public void prelievo(double amount) {
		if (amount <= this.saldo) {
			Movimento m = new Movimento("Prelievo", amount);
			this.addMovimento(m);
			this.saldo -= amount;
		} else {
			System.out.println("disponibilità insufficiente!!");
		}
	}
	public double getSaldo() {
		return this.saldo;
	}

	public ArrayList<Movimento> getMovimenti() {
		return movimenti;
	}
	
}
