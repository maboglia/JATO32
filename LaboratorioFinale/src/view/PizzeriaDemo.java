package view;

import java.io.FileNotFoundException;
import java.util.function.Predicate;

import controller.MenuPizza;
import model.Pizza;



public class PizzeriaDemo {

	public static void main(String[] args) throws FileNotFoundException {
		MenuPizza mp = new MenuPizza();
		
		//mp.showMenu();
		
		//Predicate<? super Pizza> p = t -> t.startsWith("Pizza");
		
				
				//System.out.println(p.test("Pizzetta giovanni"));
		
		mp
			.getPizze()//list pizze
			.stream()
			.filter(p -> p.trovaIngrediente("acciughe"))//illimitate operazioni intermedie
			.forEach(pizza -> System.out.println("seduto al tavolo, consumo " + pizza));//1 sola operazione terminale
		
		

	}

}
