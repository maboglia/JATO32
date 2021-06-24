package dal;

import java.sql.SQLException;
import java.util.List;

import model.Alimento;

public interface AlimentoDAO {
	
	String TROVA_TUTTI ="select * from alimenti";
	
	List<Alimento> findAll() throws SQLException; // con il throws non chiede piu il try catch;
	
	

}
