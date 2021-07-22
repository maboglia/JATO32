package gestione.pubblicazioni.service;

import java.util.List;

import gestione.pubblicazioni.entities.Fumetto;

public interface FumettoService {

	List<Fumetto> getAll();
	Fumetto add(Fumetto f);
	
}
