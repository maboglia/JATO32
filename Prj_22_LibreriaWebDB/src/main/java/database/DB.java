package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Libro;

/**
 * 
 * @author Gualtiero Connessione al Database ___
 *
 */
public class DB {
	private final String DB_NAME = "generation";
	private final String HOST = "jdbc:mysql://localhost:8889/" + DB_NAME;// host completo
	private final String USER = "app_generation";
	private final String PASS = "tss_generation2021";
	
	
	private Connection conn = null;// è la connessione al db
//	private Statement stat = null;//contenitore di istruzioni
//	private ResultSet rs = null;
	
	/**
	 * Metodo connetti: deve essere chiamato per connettere il database
	 */
	private void connetti() {
		if (this.conn == null) {
			try {
				this.conn = DriverManager.getConnection(HOST, USER, PASS);
			} catch (SQLException e) {

				System.err.println("Si è verificato un problema nella connessione: " + e.getMessage());
				// e.printStackTrace();
			} // gestore di driver
		}
	}

	public void disconnetti() throws SQLException {
		if (this.conn != null) {
			
			this.conn.close();
		}
	}

	public Connection getConn() {
		connetti();

		return conn;

	}
	
}

