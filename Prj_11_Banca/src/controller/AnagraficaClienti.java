package controller;

import java.util.ArrayList;

import model.Cliente;

public class AnagraficaClienti {

	private static ArrayList<Cliente> clienti = new ArrayList<>();

	public static ArrayList<Cliente> getClienti(){
		return clienti;
	}
	
	public static void addCliente(Cliente c) {
		clienti.add(c);
		System.out.println("Cliente aggiunto con successo!");
	}
	
}
