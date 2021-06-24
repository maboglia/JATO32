package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Alimento;

public class AlimentoDAOImpl implements AlimentoDAO {
	
	DB db = new DB();
	Statement stat;
	ResultSet rs;

	@Override
	public List<Alimento> findAll() throws SQLException {
		
		List<Alimento> alimenti = new LinkedList<>();
		stat = db.getConn().createStatement();
		rs = stat.executeQuery(TROVA_TUTTI);
		
		while (rs.next()) {
			Alimento a = new Alimento();
			a.setId(rs.getInt("id"));
			a.setEnergia(rs.getInt("energia"));
			a.setCategoria(rs.getString("categoria"));
			a.setProdotto(rs.getString("prodotto"));
			a.setCarboidrati(rs.getDouble("carboidrati"));
			a.setProteine(rs.getDouble("proteine"));
			a.setLipidi(rs.getDouble("lipidi"));
			
			alimenti.add(a);
		}
		
		return alimenti;
	}

}
