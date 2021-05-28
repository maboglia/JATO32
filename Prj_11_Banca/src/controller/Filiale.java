package controller;

import java.util.ArrayList;

import model.Cliente;
import model.ContoCorrente;
import model.Movimento;

public class Filiale {
	
	private String nomeFiliale;
	
	public Filiale(String nomeFiliale) {
		this.nomeFiliale = nomeFiliale;
	}
	
	public Cliente addCliente(String nomeNuovoCliente) {
		//aggiunge nuovo cliente al db
		ArrayList<Cliente> clienti = AnagraficaClienti.getClienti();
		Cliente nuovo = new Cliente(nomeNuovoCliente);
		clienti.add(nuovo);
		return nuovo;
	}
	
	//overload: più metodi con lo stesso nome, ma con firma (lista parametri) differente
	public void addCliente(Cliente c) {
		//aggiunge nuovo cliente al db
		ArrayList<Cliente> clienti = AnagraficaClienti.getClienti();
		clienti.add(c);
	}

	public Cliente findClienteByName(String nomeCliente) {
		ArrayList<Cliente> clienti = AnagraficaClienti.getClienti();
		for (Cliente cliente : clienti) {
			if (cliente.getNome().equals(nomeCliente)) {
				return cliente;
			}
		}
		return null;
	}
	
	
	public ContoCorrente apriConto() {
		ContoCorrente cc = new ContoCorrente();
		AnagraficaConti.getConti().add(cc);
		return cc;
	}
	
	//collegare conti ai clienti
	public void collegaContoCliente(Cliente c, ContoCorrente cc) {
		cc.addTitolare(c);
	}
	
	
	//chiudi conto
	
	//permette versamento
	public void versamento(ContoCorrente cc, double amount) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if (c.getNumero() == cc.getNumero()) {
				c.versamento(amount);
			}
		}
	}
	//permette prelievo
	public void prelievo(ContoCorrente cc, double amount) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if (c.getNumero() == cc.getNumero()) {
				c.prelievo(amount);
			}
		}
	}	
	
	public double richiediSaldo(ContoCorrente cc) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if (c.getNumero() == cc.getNumero()) {
				return c.getSaldo();
			}
		}
		return 0;
	}
	
	public ArrayList<Movimento> estrattoConto(ContoCorrente cc) {
		
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if (c.getNumero() == cc.getNumero()) {
				return c.getMovimenti();
			}
		}

		return null;
	}

	
	//findConto(int num)
	//findConto(Cliente c)
	
}
