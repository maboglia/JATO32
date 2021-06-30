package dal;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;


/**
 * @author virgy
 * Connessione al DB 
 */
public class DB {

	private final String DB_NAME = "generation";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;
	private final String USER = "app_generation";
	private final String PASS = "generation_2021!?";
	
	private Connection conn = null; //connessione al db
//	private Statement stat = null; //contenitore di istruzioni
//	private ResultSet rs = null;
	
	/**
	 * Viene chiamato per connettersi al DB
	 */
	private void connetti() {
		
		if (this.conn == null) {
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				this.conn = DriverManager.getConnection(HOST, USER, PASS);
				
				
			} catch (SQLException e) {
				
				System.err.println("problema di connessione: " + e.getMessage());
//				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				

				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 
	 * viene chiamato per disconnettersi dal DB
	 */
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
	}
}
