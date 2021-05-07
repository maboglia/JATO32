package view;

import model.Bicicletta;

public class ProvaBicicletta {

	public static void main(String[] args) {
		//dichiarato 1 oggetto di tipo Bicicletta,
		//ho creato (new) un oggetto di tipo Bicicletta,
		//usando il metodo costruttore Bicicletta()
		Bicicletta bici1 = new Bicicletta();
		Bicicletta bici2 = new Bicicletta();
		Bicicletta bicigialla = new Bicicletta();
		
		bici1.colore = "rosso";
		bici1.dimensioneRuota = 1;
		bici1.frequenza = 2;
		bici1.marcia = 3;

		bici2.colore = "arancio";
		bici2.dimensioneRuota = 2;
		bici2.frequenza = 3;
		bici2.marcia = 4;
		
		bicigialla.colore = "gialla";
		bicigialla.dimensioneRuota = 2;
		bicigialla.frequenza = 5;
		bicigialla.marcia = 5;
		
		System.out.println("la bici " + bici1.colore + " va a " + bici1.calcolaVelocita());
		System.out.println("la bici " + bici2.colore + " va a " + bici2.calcolaVelocita());
		System.out.println("la bici " + bicigialla.colore + " va a " + bicigialla.calcolaVelocita());
		
		bicigialla.frequenza=3;
		System.out.println("la bici " + bicigialla.colore + " va a " + bicigialla.calcolaVelocita());
		
		
	}

}
