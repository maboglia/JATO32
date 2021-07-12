package biblio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import biblio.dal.AutoreDAO;
import biblio.entities.Autore;

@Service
public class AutoreServiceImpl implements AutoreService{

	@Autowired
	private AutoreDAO repo;
	
	@Override
	public List<Autore> dammiTuttiGliAutori() {
		
		return repo.findAll();
	}

	@Override
	public Autore unSoloAutore(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Autore unSoloAutoreByCognome(String cognome) {
		// TODO Auto-generated method stub
		return null;
	}


}
