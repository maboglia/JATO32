package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;



import entities.Libro;

public class LibroDAOImpl implements LibroDAO {

	private DB db = new DB();
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void addLibro(Libro l) {
this.conn=db.getConn();
try {
	ps = conn.prepareStatement(ADD);
	ps.setString(1, l.getNome());
	ps.setDouble(2, l.getPrezzo());
	ps.execute();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	@Override
	public Map<Integer, Libro> getAll() {
		Map<Integer, Libro> mappa= new HashMap<>();
	try {
		rs =	db.getConn().createStatement().executeQuery(GET_ALL);
		while(rs.next()) {
			Libro l = new Libro();
			l.setNome(rs.getString("titolo"));
			l.setPrezzo(rs.getDouble("prezzo"));
			l.setId_libro(rs.getInt("id"));
			l.setnPagine(rs.getInt("pagine"));
			l.setPrezzo_iva(rs.getDouble("prezzo_iva"));
			l.setId_editore(rs.getInt("editore_id"));
			mappa.put(l.getId_libro(), l);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return mappa; 
		
	}

	@Override
	public Libro getOneByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro getOneById(int id) {
		
		return getAll().get(id);
	}

	@Override
	public void updateLibro(Libro l) {
		this.conn=db.getConn();
		try {
			ps = conn.prepareStatement(UPDATE);
			ps.setString(1, l.getNome());
			ps.setInt(2, l.getId_libro());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteLibro(int id) {
		this.conn=db.getConn();
		try {
			ps = conn.prepareStatement(DELETE_ONE);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	LibroDAOImpl ld = new LibroDAOImpl();
	//ld.addLibro(new Libro(12, "IT", 1, 20.0, 22.0, 0));
	//System.out.println(ld.getAll().values()); 
	ld.deleteLibro(26);
	Libro l1 = ld.getOneById(25);
	System.out.println(l1);
	l1.setNome("Simone: Fondamenti di Java");
	ld.updateLibro(l1);
	ld.getAll().values().forEach(l->System.out.println(l.getNome()));
	
}
}
