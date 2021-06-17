package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private final String DB_NAME = "generation";
	private final String HOST = "jdbc:mysql://localhost:8889/" + DB_NAME;//host completo
	private final String USER = "app_generation";
	private final String PASS = "generation_2021";

	
	private Connection conn = null;//è la connessione al db
//	private Statement stat = null;//contenitore di istruzioni
//	private ResultSet rs = null;
	
	public Connection connetti() throws SQLException {
		this.conn = DriverManager.getConnection(HOST, USER, PASS);//gestore di driver
		
		return conn;
	}
	
	public void disconnetti() throws SQLException {
		if (this.conn != null) {
			this.conn.close();
		}
	}
}
