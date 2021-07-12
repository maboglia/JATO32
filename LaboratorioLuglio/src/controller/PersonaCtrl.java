package controller;

import java.util.ArrayList;
import java.util.List;

import model.Persona;
import view.ElencoPersone;

public class PersonaCtrl {

	private List<Persona> persone;
	
	
	public PersonaCtrl() {
		this.persone = new ArrayList<>();
		System.out.println("costruito il controller");
	}
	
	public void addPersona(Persona p) {
		this.persone.add(p);
	}
	
	public List<Persona> getPersone() {
		return persone;
	}
	
	public String mostraElenco() {
		
		String view = ElencoPersone.showList(persone);
		return view;
	}
}
