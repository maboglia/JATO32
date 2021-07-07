package biblio.services;

import java.util.List;

import biblio.entities.Libro;

public interface LibroService {

	List<Libro> trovaTutti();
	Libro trovaUno(int id);
	
	void eliminaLibro(int id);
	Libro modificaLibro(Libro l);
	Libro creaLibro(Libro l);
	
}
