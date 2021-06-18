package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Libro;


public class LibroDAO {
	
	private DB db = new DB();
	private Statement stat = null;
	private ResultSet rs = null;
	private ArrayList<Libro> libri = new ArrayList<>();
	
	public ArrayList<Libro> findAll() {
		
		try {
			stat = db.getConn().createStatement();//statement è oggetto che porta la query al db
			
			String sql = "select * from libro";
			rs = stat.executeQuery(sql);
			
			//svuoto l'AL di libri
			libri.clear();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int pagine = rs.getInt("pagine");
				int editore_id = rs.getInt("editore_id");
				String titolo = rs.getString("titolo");
				double prezzo = rs.getDouble("prezzo");
				double prezzo_iva = rs.getDouble("prezzo_iva");
				
				Libro l = new Libro(id, titolo, pagine, editore_id, prezzo_iva, prezzo);
				
				libri.add(l);
				
				
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return libri;
		
	}
	
	public void addLibro(Libro l) {
		try {
			stat = db.getConn().createStatement();
			int i = stat.executeUpdate("INSERT INTO `libro` (`id`, `titolo`, `prezzo`, `prezzo_iva`, `pagine`, `editore_id`) VALUES (NULL, '"+
								l.getTitolo()+"',"+l.getPrezzo()+" ,"+l.getPrezzo_iva()+" ,"+l.getPagine()+" ,"+l.getEditore_id()+" )");
			System.out.println("Libri inseriti: " + i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void deleteLibro(int id) {
		try {
			stat = db.getConn().createStatement();
			int i = stat.executeUpdate("Delete from libro where id = " + id);
			System.out.println("Libri eliminati: " + i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void updateLibro(Libro l) {
		try {
			stat = db.getConn().createStatement();
			int i = stat.executeUpdate("update `libro` set"
					+ " `titolo` = '"+l.getTitolo()+"',"
					+ " `prezzo`="+l.getPrezzo()+", "
					+ "`prezzo_iva`="+l.getPrezzo_iva()+","
					+ " `pagine`="+l.getPagine()+","
					+ "`editore_id`="+l.getEditore_id()+" where id = "+ l.getId());
			System.out.println("Libri inseriti: " + i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LibroDAO ld = new LibroDAO();
		System.out.println(ld.findAll());
		Libro l = ld.libri.get(4);
//		ld.addLibro(l);
//		ld.deleteLibro(25);
		l.setPagine(1500);
		ld.updateLibro(l);
		
	}
	
	
	
	
	
	
	
	
	
}
