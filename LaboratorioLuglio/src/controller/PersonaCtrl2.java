package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Persona;

public class PersonaCtrl2 {

	
	
	public static void main(String[] args) {
		Persona p1 = new Persona("pippo", 54, false); 
		Persona p2 = new Persona("pippi", 45, true); 
		Persona p3 = new Persona("pippe", 50, false); 
		Persona p5 = new Persona("pippa", 25, false); 
		Persona p4 = new Persona("pippu", 31, true); 
		
		List<Persona> persone = new ArrayList<Persona>();

		persone.add(p1);
		persone.add(p2);
		persone.add(p3);
		persone.add(p4);
		persone.add(p5);
		
		System.out.println(persone);
		
		Collections.sort(persone);//esegue ordinam alfabetico per nome
		System.out.println(persone);
		
			
		Collections.sort(persone, (uno, due) -> uno.getEta() - due.getEta());	
		System.out.println(persone);

		persone
			.stream()
			.filter(p -> p.getEta()> 40)//operazione intermedia
			.filter(p -> p.getNome().endsWith("o"))//operazione intermedia
			.forEach(p ->System.out.println(p));//una sola operazione terminale
		
		
	}

	
	
}
