package dal;

import java.util.List;

import model.Studente;

public interface StudenteDAO {
 
	String GET_ALL = "select nome, cognome, eta from studente";
	
	List<Studente> findAll();
}
