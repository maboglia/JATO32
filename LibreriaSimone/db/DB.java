package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author EOTheDev
 * 
 * Connessione al database.
 * 
 * */

public class DB {
	 
	private final String DB_NAME="generation.";
	private final String HOST="jdbc:mysql://localhost:3306/"+DB_NAME; //host completo
	private final String USER="app_generation";
	private final String PASSWORD="Generation2021!?";
	private Connection conn= null;
	
private Statement stat=null;
	private ResultSet rs=null; 
	
	/**
	 * Metodo connetti:
	 * 
	 * dev'essere chiamato per effettuare la chiamata al DB.
	 * 
	 *  */ 
	private void connetti(){
		if (this.conn==null) {
			try {
				this.conn=DriverManager.getConnection(HOST,USER, PASSWORD);
			} catch (SQLException e) {
				System.err.println("Si è verificato un problema nella connessione: "+e.getMessage());
//				e.printStackTr ace();
			}			
		}
	}
	public void disconetti() throws SQLException {
		
if (this.conn!=null) {
			this.conn.close();
		}
	}
	public Connection getConn() {
		connetti();
		return conn;
	}
}
	
	
