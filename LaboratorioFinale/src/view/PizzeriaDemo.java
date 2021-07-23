package view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import controller.MenuPizza;
import model.Pizza;



public class PizzeriaDemo {

	public static void main(String[] args) throws FileNotFoundException {
		MenuPizza mp = new MenuPizza();
		
		//mp.showMenu();
		
		//Predicate<? super Pizza> p = t -> t.startsWith("Pizza");
		
				
				//System.out.println(p.test("Pizzetta giovanni"));
		
//		mp
//			.getPizze()//list pizze
//			.stream()
//			//.filter(p -> p.trovaIngrediente("acciughe"))//illimitate operazioni intermedie
//			//.filter(p -> p.trovaIngrediente("capperi"))//illimitate operazioni intermedie
//			.forEach(pizza -> System.out.println("seduto al tavolo, consumo " + pizza));//1 sola operazione terminale
		
		
		Comparator<Pizza> comp = (p1, p2) -> {
			return (p1.getPrezzo()-p2.getPrezzo()==0)
			? 0:
				(p1.getPrezzo()>p2.getPrezzo())? 1:
					-1;
			};
		
		List<Pizza> contieneMozza = mp.getPizze()
					.stream()
					.filter(p -> p.trovaIngrediente("mozzarella"))
					.sorted(comp)
					.collect(Collectors.toList());
		
		String tab = Formattatore.tabella(contieneMozza);
		
		String html = Formattatore.paginator(tab);
		
		stampaHTML(html, "files/pizze_mozza.html");
	}
	
	public static void stampaHTML(String html, String nomeFile) {
		
		try (
				FileWriter fw = new FileWriter(nomeFile);
				)//try with resources
		
		{
			for (int i = 0; i < html.length(); i++) {
				fw.write(html.charAt(i));
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	

}
