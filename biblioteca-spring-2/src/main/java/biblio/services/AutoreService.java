package biblio.services;

import java.util.List;

import biblio.entities.Autore;

public interface AutoreService {

	
	List<Autore> dammiTuttiGliAutori();
	Autore unSoloAutore(int id);
	Autore unSoloAutoreByCognome(String cognome);
	
}
