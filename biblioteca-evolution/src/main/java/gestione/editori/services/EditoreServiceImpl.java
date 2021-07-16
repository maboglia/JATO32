package gestione.editori.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestione.editori.entities.Editore;
import gestione.editori.repos.EditoreDAO;

@Service
public class EditoreServiceImpl implements EditoreService {

	@Autowired
	private EditoreDAO repo;
	
	@Override
	public List<Editore> getAll() {
		return repo.findAll();
	}

	@Override
	public Editore getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Editore getByName(String name) {
		return repo.findByNome(name);
	}

	@Override
	public Editore addEditore(Editore e) {
		return repo.save(e);
	}

	@Override
	public Editore updEditore(Editore e) {
		return repo.save(e);
	}

	@Override
	public void delById(int id) {
		repo.deleteById(id);
		
	}

}
