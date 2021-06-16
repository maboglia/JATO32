package dal;

import java.util.ArrayList;

import model.Giornale;
import model.Libro;
import model.Pubblicazione;

public class LibroDAO {

	private ArrayList<Pubblicazione> libri = new ArrayList<>();
	
	//blocco di inizializzazione
	{
		libri.add((new Libro(1,25,1,"I malavoglia",10)));
		libri.add((new Libro(2,50,3,"Guerra e pace",15)));
		libri.add((new Libro(3,20,2,"Zanna bianca",50)));
		libri.add((new Libro(4,45,2,"Pinocchio",30)));
		libri.add(new Giornale("La stampa", 1.5));
		libri.add((new Libro(5,35,3,"Ventimila leghe sotto i mari",5)));
	}
	
	public ArrayList<Pubblicazione> getLibri() {
		return libri;
	}
}
