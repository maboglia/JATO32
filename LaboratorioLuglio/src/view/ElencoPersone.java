package view;

import java.util.List;

import model.Persona;

public class ElencoPersone {

	public static String showList(List<Persona> persone) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Persona persona : persone) {
			sb.append(persona + "\n");
		}
		
		return sb.toString();
		
	}
	
	
}
