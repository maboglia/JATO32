package prova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.*;

public class ProvaVeicoli {


	List<Veicolo> veicoli = new ArrayList<Veicolo>();
	Set<Motorizzata> motorizzati = new HashSet<Motorizzata>();
	
	
	public static void main(String[] args) {
		Veicolo a1 = new Bicicletta();
		Veicolo a2 = new Motocicletta();
		Veicolo a3 = new Automobile();
		Veicolo a4 = new AutomobileCorsa();
		
		Motorizzata m1 = (Motorizzata) a2;//faccio cast, perché siamo sicuri che sia così1
		Motorizzata m2 = new Automobile();
		Motorizzata m3 = new AutomobileCorsa();
	
		ProvaVeicoli pv = new ProvaVeicoli();
		
		pv.veicoli.add(a1);
		pv.veicoli.add(a2);
		pv.veicoli.add(a3);
		pv.veicoli.add(a4);
		pv.veicoli.add(a4);
		

		pv.motorizzati.add(m1);
		pv.motorizzati.add(m2);
		pv.motorizzati.add(m3);
		pv.motorizzati.add(m1);
		
		System.out.println(pv.veicoli.size());
		
		System.out.println(pv.motorizzati.size());
		
//		for (Veicolo v : pv.veicoli) {
//			
//			if (v instanceof Motorizzata) {
//				System.out.println(((Motorizzata) v).RUMORE);
//				System.out.println("nel veicolo puoi mettere carburante");
//			} else {
//				System.out.println("nel veicolo NON puoi mettere carburante");
//				
//			}
//
//			
//			
//		}
		
		for (Veicolo v : pv.veicoli) {System.out.println("Il veicolo v " + v);}
		
		System.out.println("...............................................");
		
		//functional programming in java, con uso delle interfacce funzionali
		pv.veicoli.forEach(v -> System.out.println("Il veicolo v " + v));
		
		
		
		
		
		
	}
	
	
	
}
