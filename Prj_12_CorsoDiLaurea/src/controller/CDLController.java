package controller;

import java.util.ArrayList;
import java.util.Random;

import model.CorsoDiLaurea;
import model.Esame;
import model.Studente;

public class CDLController {

	public CorsoDiLaurea cdl;

	public CDLController(String nome) {
		this.cdl = new CorsoDiLaurea(nome);
	}
	
	public void immatricola(String nomeStudente) {
		
		int i = this.cdl.getMatricolatore();
		this.cdl.incrementaContatore();
		
		ArrayList<Esame> esami = new ArrayList<>();
		esami.add(new Esame("Informatica I", 12));
		esami.add(new Esame("Informatica II", 10));
		esami.add(new Esame("Informatica III", 12));
		esami.add(new Esame("Informatica IV", 10));
		esami.add(new Esame("Informatica V", 12));
		
		Studente s = new Studente(nomeStudente, i, esami);
		
		this.cdl.getStudentiIscritti().add(s);
		System.out.println("Studente " + s + " immatricolato!");
		
	}
	
	public void daiEsame(Studente s, Esame e) {
		Random voto = new Random();
		
		int votoRandom = voto.nextInt(30) + 1;
		
//		System.out.println("Appello di " + e);
		System.out.println("Esame di " + s);
		System.out.println(e);
		
		if (votoRandom >= 18) {
			System.out.println("promosso");
			s.getEsamiDare().remove(e);
			e.setVoto(votoRandom);
			s.getEsamiSostenuti().add(e);
		} else {
			System.out.println("NON promosso");
		}
		
	}
	

	
	
}
