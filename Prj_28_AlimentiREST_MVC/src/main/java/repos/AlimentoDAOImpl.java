package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entities.Alimento;

public class AlimentoDAOImpl implements AlimentoDAO {

	private DB db = new DB();
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public List<Alimento> findAll() {
		
		List<Alimento> alimenti = new ArrayList<Alimento>();
		
		try {
			ps = db.getConn().prepareStatement(TROVA_TUTTI);
			rs = ps.executeQuery();
			
			//ho tutti gli alimenti, uno per riga del db
			while(rs.next()) {
				//cosa faccio con ciascun record
				Alimento a = new Alimento();
				a.setId(rs.getInt("id"));
				a.setCarboidrati(rs.getDouble("carboidrati"));
				a.setProteine(rs.getDouble("proteine"));
				a.setLipidi(rs.getDouble("lipidi"));
				a.setEnergia(rs.getInt("energia"));
				a.setCategoria(rs.getString("categoria"));
				a.setProdotto(rs.getString("prodotto"));
				alimenti.add(a);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return alimenti;
	}

	@Override
	public List<Alimento> findAlimentiByCat(String cat) {
		List<Alimento> alimenti = new ArrayList<Alimento>();
		
		try {
			ps = db.getConn().prepareStatement(TROVA_BY_CAT);
			ps.setString(1, cat);
			rs = ps.executeQuery();
			
			//ho tutti gli alimenti, uno per riga del db
			while(rs.next()) {
				//cosa faccio con ciascun record
				Alimento a = new Alimento();
				a.setId(rs.getInt("id"));
				a.setCarboidrati(rs.getDouble("carboidrati"));
				a.setProteine(rs.getDouble("proteine"));
				a.setLipidi(rs.getDouble("lipidi"));
				a.setEnergia(rs.getInt("energia"));
				a.setCategoria(rs.getString("categoria"));
				a.setProdotto(rs.getString("prodotto"));
				alimenti.add(a);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return alimenti;
	}

	@Override
	public Set<String> findCategorie() {
		Set<String> alimenti = new TreeSet<String>();
		
		try {
			ps = db.getConn().prepareStatement(TROVA_CAT);
			rs = ps.executeQuery();
			
			//ho tutti le categorie degli alimenti, uno per riga del db
			while(rs.next()) {
				//cosa faccio con ciascun record
				alimenti.add(rs.getString("categoria"));
				System.out.println(rs.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alimenti;
	}
}
