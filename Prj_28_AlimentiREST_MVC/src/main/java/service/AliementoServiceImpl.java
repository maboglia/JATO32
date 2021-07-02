package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entities.Alimento;
import repos.AlimentoDAO;
import repos.AlimentoDAOImpl;

public class AliementoServiceImpl implements AlimentoService {

	private AlimentoDAO repo = new AlimentoDAOImpl();
	
	
	@Override
	public List<Alimento> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Alimento> findByCat(String cat) {
		// TODO Auto-generated method stub
		return repo.findAlimentiByCat(cat);
	}

	@Override
	public List<String> findCategorie() {
		
		List<String> categorie = new ArrayList<String>();
		
		Set<String> findCategorie = repo.findCategorie();
		
		for (String categoria : findCategorie) {
			categorie.add(categoria);
		}
		
		return categorie;
	}

}
