package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private final String DB_NAME = "Generation";
	private final String HOST = "jdbc:mysql://localhost:8889/" + DB_NAME;//host completo
	private final String USER = "app_generation";
	private final String PASS = "generation_2021";
	
	
	private Connection conn = null;// è la connessione al db
//	private Statement stat = null;//contenitore di istruzioni
//	private ResultSet rs = null;
	
	/**
	 * Metodo connetti: deve essere chiamato per connettere il database
	 */
	private void connetti() {
		if (this.conn == null) {
			try {
				//Class.forName("com.mysql.cj.jdbc.driver");
				this.conn = DriverManager.getConnection(HOST, USER, PASS);
			} catch (SQLException e) {

				System.err.println("Si è verificato un problema nella connessione: " + e.getMessage());
				// e.printStackTrace();
			} // gestore di driver
// catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
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
	public static void main(String[] args) {
		DB db = new DB();
		db.connetti();
		System.out.println("ciao");
	}
}
