package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import dal.LibroDAO;
import dal.LibroDAOImpl;
import entities.Libro;

public class LibroService {

	private LibroDAO ld = new LibroDAOImpl();
	
	public Set<String> getTitoli(){
		Set<String> titoli = new TreeSet();
		for (Libro l : ld.getAll()) {
			titoli.add(l.getTitolo());
		}
		return titoli;
	}

	
	
	
	
}
