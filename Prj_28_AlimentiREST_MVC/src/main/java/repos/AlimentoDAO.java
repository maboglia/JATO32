package repos;

import java.util.List;
import java.util.Set;

import entities.Alimento;

public interface AlimentoDAO {

	String TROVA_TUTTI = "SELECT * FROM `alimenti`";
	String TROVA_CAT = "SELECT distinct(categoria) FROM `alimenti`";
	String TROVA_BY_CAT = "SELECT * FROM `alimenti` WHERE categoria = ?";
	
	List<Alimento> findAll();
	List<Alimento> findAlimentiByCat(String cat);
	Set<String> findCategorie();
}
