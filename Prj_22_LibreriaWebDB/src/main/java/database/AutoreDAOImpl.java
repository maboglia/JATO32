package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Autore;
import model.Libro;

public class AutoreDAOImpl implements AutoreDAO {
	
	private DB db = new DB();
	private Statement stat = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private ArrayList<Autore> autori = new ArrayList<>();
	
	@Override
	public ArrayList<Autore> findAll() {

		try {
			stat = db.getConn().createStatement();
			rs = stat.executeQuery(TROVA_TUTTI);
			
			autori.clear();
			while (rs.next()) {
				Autore a = new Autore();
				a.setId(rs.getInt("id"));
				a.setNome(rs.getString("nome"));
				a.setCognome(rs.getString("cognome"));
				a.setNazionalita(rs.getString("nazionalita"));
				
				autori.add(a);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return autori;
	}

	@Override
	public Autore findById(int id) {
		try {
			ps = db.getConn().prepareStatement(TROVA_UNO);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
			Autore a = new Autore();
			a.setId(rs.getInt("id"));
			a.setNome(rs.getString("nome"));
			a.setCognome(rs.getString("cognome"));
			a.setNazionalita(rs.getString("nazionalita"));

			return a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		
		try {
			ps = db.getConn().prepareStatement(DELETE);
			ps.setInt(1, id);
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Autore a) {

		try {
			ps = db.getConn().prepareStatement(UPDATE);
			ps.setString(1, a.getNome());
			ps.setString(2, a.getCognome());
			ps.setString(3, a.getNazionalita());
			ps.setInt(4, a.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addAutore(Autore a) {
		
		try {
			ps = db.getConn().prepareStatement(ADD);
			ps.setString(1, a.getNome());
			ps.setString(2, a.getCognome());
			ps.setString(3, a.getNazionalita());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
