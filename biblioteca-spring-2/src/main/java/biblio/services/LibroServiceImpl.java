package biblio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblio.entities.Libro;
import biblio.dal.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroDAO repo;
	

	@Override
	public List<Libro> trovaTutti() {
		return repo.findAll();
	}

	@Override
	public Libro trovaUno(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminaLibro(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Libro modificaLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro creaLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> libriAutore(int id) {
		
		return null;
	}

}
