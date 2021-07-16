package gestione.editori.services;

import java.util.List;

import gestione.editori.entities.Editore;

public interface EditoreService {

	List<Editore> getAll();
	Editore getById(int id);
	Editore getByName(String name);
	Editore addEditore(Editore e);
	Editore updEditore(Editore e);
	void delById(int id);
	
	
}
