package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Studente;

public class StudenteDAOImpl implements StudenteDAO {

	DB db = new DB();
	Statement stat;
	ResultSet rs;
	
	@Override
	public List<Studente> findAll() {
		
		List<Studente> studenti = new ArrayList<>();
		
		try {
			stat = db.getConn().createStatement();
			rs = stat.executeQuery(GET_ALL);
			while (rs.next()) {  //finchè ci sono record (studenti)
				Studente s = new Studente();
				s.setNome(rs.getString("nome"));
				s.setCognome(rs.getString("cognome"));
				s.setEta(rs.getInt("eta"));
				
				studenti.add(s);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studenti;
	}

}
