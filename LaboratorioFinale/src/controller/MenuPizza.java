package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pizza.Ingrediente;
import model.Pizza;

public class MenuPizza {

	private List<Pizza> pizze;

	public MenuPizza() throws FileNotFoundException {
		this.pizze = new ArrayList<Pizza>();
		
		//carico i dati da file
		File f = new File("files/pizze.txt");
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			
			Pizza p = new Pizza();
			
			String[] split = sc.nextLine().split(";");
			//System.out.println(split[1]);
			
			p.setNome(split[0]);
			p.setPrezzo(Double.parseDouble(split[2]));
			
			String[] ingredienti = split[1].split(", ");
			
			for(String i : ingredienti) {
				
				p.addIngrediente(i);
				System.out.println(i);
			
			}
			this.pizze.add(p);
		}
		
	}
	
	public List<Pizza> getPizze() {
		return pizze;
	}
	
	public void showMenu() {
		this.pizze.forEach(p  ->   System.out.println(p) );
	}
	
	
}
