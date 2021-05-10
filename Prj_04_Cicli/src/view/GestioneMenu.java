package view;

import java.util.Scanner;

public class GestioneMenu {

	static String[] pizza = {
			"margherita",	
			"4 formaggi",	
			"melanzane"	
	};
	
	
	public static void main(String[] args) {
		
		menuPizza();
		Scanner sc = new Scanner(System.in);
		String scelta = sc.next();

		while(!scelta.equals("esci")) {
			menuPizza();
			scelta = sc.next();
		}
		
		
	}

	
	private static void menuPizza() {
		System.out.println("scegli pizza");
		for (int i = 0; i < pizza.length; i++) {
			System.out.println(i + ") " +pizza[i]);
		}
	}

}
