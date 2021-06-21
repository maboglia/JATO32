package prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ProvaCollezioni {

	List<String> spesa = new ArrayList<>();
	
	Set<String> spesaFiltrata = new HashSet<>();//set (no duplicati) non ordinato
	
	Set<String> spesaOrdinata = new TreeSet<String>();//set (no duplicati) ordinato (Comparable)
	
	public static void main(String[] args) {
		
		ProvaCollezioni pc = new ProvaCollezioni();
		
		pc.spesa.add("latte");
		pc.spesa.add("pane");
		pc.spesa.add("biscotti");
		pc.spesa.add("olio");
		pc.spesa.add("biscotti");
		

		System.out.println(pc.spesa.size());
		
		for (String voce : pc.spesa) {
			pc.spesaFiltrata.add(voce);
			pc.spesaOrdinata.add(voce);
		}

		System.out.println(pc.spesaFiltrata.size());
		for (String string : pc.spesaOrdinata) {
			System.out.println(string);
		}
		
		Map<String, String> regioni = new TreeMap<>();
		
		regioni.put("Piemonte", "Torino");
		regioni.put("Lombardia", "Milano");
		regioni.put("Toscana", "Firenze");
		regioni.put("Puglia", "Bari");
		
		System.out.println(regioni.size());
		
		System.out.println(regioni.get("Piemonte"));
		
		System.out.println(regioni.keySet());
		
		System.out.println(regioni.values());
		
//		for (String regione : regioni.keySet()) {
//			System.out.println("Il capoluogo della regione " 
//							+ regione 
//							+ " è: " 
//							+ regioni.get(regione));
//		}
//		
		
		for (Entry<String, String> regione : regioni.entrySet()) {
			System.out.print("Il capoluogo della regione "  + regione.getKey());
			System.out.println(" è: " + regione.getValue());
			System.out.println(regione);
		}
		
		
	}
	
}
