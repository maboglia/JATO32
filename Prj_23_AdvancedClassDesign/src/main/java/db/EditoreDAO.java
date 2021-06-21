package db;

import java.util.List;
import java.util.Map;

import model.Editore;

public interface EditoreDAO {

	//C: Create
	String ADD = "INSERT INTO editore (nome) values(?)";
	//R: Read - Retrieve
	String FIND_ALL = "SELECT * from editore";
	String FIND_ONE = "SELECT * from editore WHERE id = ?";
	
	//U: Update
	String UPDATE = "UPDATE editore set nome = ? where id = ?";
	
	//D: Delete
	String DELETE_ONE = "DELETE from editore WHERE id = ?";
	
	//C: Create
	void addEditore(Editore e);

	//R: Read - Retrieve
	List<Editore> getAll();
	Map<Integer, Editore> getAllEditori();
	Editore getOneById(int id);
	Editore getOneByName(String name);
	
	//U: Update
	void updEditore(Editore e);
	
	//D: Delete
	void delEditoreById(int id);
	
	
}
