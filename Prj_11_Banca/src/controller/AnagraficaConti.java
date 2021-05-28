package controller;

import java.util.ArrayList;

import model.ContoCorrente;

public class AnagraficaConti {
	private static ArrayList<ContoCorrente> conti = new ArrayList<>();

	public static ArrayList<ContoCorrente> getConti() {
		return conti;
	}
	
	public static void addConto(ContoCorrente cc) {
		conti.add(cc);
		System.out.println("Conto aggiunto con successo!");
	}
}
