package dal;

import java.sql.Connection; // è un interfaccia
import java.sql.DriverManager;
import java.sql.ResultSet; // è un interfaccia
import java.sql.SQLException;
import java.sql.Statement; //è un oggetto

public class DB {
//faccio le stesse cose che faccio nella shell 
	//questi andrebbero in un file di testo a parte
	private final String DB_NAME = "generation";
	private final String HOST = "jdbc:mysql://localhost:3306/"+DB_NAME; //host completo
	private final String USER = "app_generation";
	private final String PASS = "generation_2021!?";
	
	private Connection conn = null; //ci xmette di connetterci al db
	 
	 //query portata al db (la busta con l'istruzione che chiederò al db che prevede un RISULTATO)
	 //private Statement stat = null;
	 //private ResultSet rs = null;
	
	
	
	 
	 //metdoto x ritornare una connessione al db
	public Connection getConn() {
		if(this.conn == null) {
			connetti();}
		return conn;
	}
	
	/**
	 * deve essere chiamato per connettersi
	 */
	 private void connetti()  {
		 if(this.conn == null)
			try {
				this.conn = DriverManager.getConnection(HOST, USER, PASS);
			} catch (SQLException e) {
				System.err.println("si è verificato un problema nella connessione: " +e.getMessage());
				//e.printStackTrace();
			}
		 
		
	 }
	 
	 

	public void disconnetti() throws SQLException {
		 if(this.conn != null) {
			 this.conn.close();
		 }
	 }
	 
	 
	
	
}
