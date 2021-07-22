package gestione.pubblicazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestione.pubblicazioni.dal.FumettoDAO;
import gestione.pubblicazioni.entities.Fumetto;

@Service
public class FumettoServiceI implements FumettoService {

	@Autowired
	private FumettoDAO fd;
	
	@Override
	public List<Fumetto> getAll() {
		return fd.findAll();
	}

	@Override
	public Fumetto add(Fumetto f) {
		return fd.save(f);
	}

}
