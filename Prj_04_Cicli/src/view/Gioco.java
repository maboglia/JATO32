package view;

import model.Player;

public class Gioco {

	static int contatore = 0;
	static int record = 0;
	
	
	public static void main(String[] args) {
		
		status();
		
		init();
		init();
		init();
		
		status();
		//chiedo se vuole rigiocare

	}


	private static void init() {
		//insert coin
		System.out.println("INSERT COIN");
		//verifica coin
		System.out.println("Verifica in corso..");
		System.out.println("Inizia la partita");
		Player pippo = new Player();
		
		//inizia -> crea il player
		//incremento contatore partite
		Gioco.contatore++;
		//player gioca: lancia 3 volte 
		for (int i = 0; i < 3; i++) {
			
			//ogni lancio determina un punteggio casuale da 0 a 100
			 int casuale = (int) (Math.random() * 101);
			 pippo.modificaPunteggio(casuale);
			 
		}
		System.out.println("Il punteggio del giocatore è: " + pippo.getScore()) ;
		//finisce la partita 
		//verifico se il punteggio del player super il record attuale
		
		if (pippo.getScore() > Gioco.record   ) {
			System.out.println("NUOVO RECORD DEL GIOCO!!!!!!");
			Gioco.record = pippo.getScore();
		}
		
		//n caso affermativo sostituisco il valore di record attuale col punteggio di player		
	}


	private static void status() {
		System.out.println("Benvenuto nel gioco");
		System.out.println("Partite giocate " + Gioco.contatore);
		System.out.println("Il record del gioco è: " + Gioco.record);
		
	}
	
	
	
	
	
	
	
	

}
