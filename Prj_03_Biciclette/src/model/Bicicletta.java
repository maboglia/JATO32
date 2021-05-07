package model;

public class Bicicletta {

	public String colore;
	public int velocita;
	public int marcia;
	public int dimensioneRuota;
	public int frequenza;
	
	public int calcolaVelocita() {
		
		return dimensioneRuota * marcia * frequenza;
		
	}
	
	
}
