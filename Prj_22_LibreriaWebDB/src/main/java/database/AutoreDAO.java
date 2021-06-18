package database;

import java.util.ArrayList;
import model.Autore;

public interface AutoreDAO {

	String TROVA_TUTTI = "select * from autore";
	String TROVA_UNO = "select * from autore where id=?";
	String ADD = "insert into autore(nome, cognome, nazionalita) values (?,?,?)";
	String UPDATE = "update autore set nome=?, cognome=?, nazionalita=? where id=?";
	String DELETE = "delete from autore where id=?";
	
	
	ArrayList<Autore> findAll();
	
	Autore findById(int id);
	
	void deleteById(int id);
	
	void update(Autore a);
	
	void addAutore(Autore a);
		
	
	
	
	
	
}
