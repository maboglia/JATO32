package model;

import java.util.ArrayList;

public class Libreria {

	private ArrayList<Scaffale> scaffali;
	
	public Libreria() {
		this.scaffali = new ArrayList<>();
		System.out.println("Libreria Creata!");
	}

	public ArrayList<Scaffale> getScaffali() {
		return scaffali;
	}

	public void setScaffali(ArrayList<Scaffale> scaffali) {
		this.scaffali = scaffali;
	}
}
