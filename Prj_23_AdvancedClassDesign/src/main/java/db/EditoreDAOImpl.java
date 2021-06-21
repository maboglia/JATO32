package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Editore;

public class EditoreDAOImpl implements EditoreDAO {

	private DB db = new DB();
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void addEditore(Editore e) {
		this.conn = db.getConn();
		try {
			ps = conn.prepareStatement(ADD);
			ps.setString(1, e.getNome());
			boolean ok = ps.execute();
			
			if (ok) {
				System.out.println("editore aggiunto");
			} else {
				System.out.println("editore NON aggiunto");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Editore> getAll() {
		
		List<Editore> editori = new ArrayList<>();
		
		try {
			rs = db.getConn().createStatement().executeQuery(FIND_ALL);
		
			while (rs.next()) {
				Editore e = new Editore();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				editori.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return editori;
	}

	@Override
	public Editore getOneById(int id) {
		
		return getAllEditori().get(id);
		
	}

	@Override
	public Editore getOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updEditore(Editore e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delEditoreById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Editore> getAllEditori() {
		
		Map<Integer, Editore> editori = new HashMap<>();
		
		try {
			rs = db.getConn().createStatement().executeQuery(FIND_ALL);
		
			while (rs.next()) {
				Editore e = new Editore();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				editori.put(e.getId(), e);//come chiave l'id, come valore l'intero Editore
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return editori;
	}

}
