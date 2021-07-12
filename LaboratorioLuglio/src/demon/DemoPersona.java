package demon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import controller.PersonaCtrl;
import model.Persona;

public class DemoPersona {

	public static void main(String[] args) {
		PersonaCtrl pc = new PersonaCtrl();
		
		pc.addPersona(new Persona("mauro", 30, true));
		pc.addPersona(new Persona("gilberto", 29, false));
		pc.addPersona(new Persona("virgilio", 28, true));
		pc.addPersona(new Persona("elena", 27, false));
		pc.addPersona(new Persona("simone", 26, true));

		
//		List<String> nomi = pc.getPersone()	//java functional programming
//			.stream()
//			.map(p -> p.getNome())
////			.filter(p -> p.getEta()<28)
////			.filter(p -> p.getEta()>26)
//			.collect(Collectors.toList());
		
		Persona[] people = {
				new Persona("gilberto", 29, false),
				new Persona("gilberto", 29, false),
				new Persona("gilberto", 29, false),
				new Persona("gilberto", 29, false),
		};
		
		List<Persona> listaPeople = Arrays.asList(people);
		
		Object[] array = listaPeople.toArray();
		
		for (Object object : array) {
			if (object instanceof Persona)
				System.out.println(   ((Persona)object).getNome()       );
		}
		
		
		Map<String, Persona> mappa = new HashMap<String, Persona>();
		
		mappa.put("primo", people[0]);
		mappa.put("secondo", pc.getPersone().get(2));
		mappa.put("primo", pc.getPersone().get(2));
		
		System.out.println(mappa);
		
		
		
//		System.out.println(nomi);
	}

}
