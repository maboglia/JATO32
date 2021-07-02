package dal;

import java.util.List;

import entities.Libro;

public interface LibroDAO {

	String TROVA_TUTTI = "select id,titolo from libro";
	
	List<Libro> getAll();
	
	
	
	
}
