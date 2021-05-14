package view;

import model.Moneta;

public class SceltaGiusta {

	static int contaTesta = 0;
	static int contaCroce = 0;
	static final int RIP = 15;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < RIP; i++) {
			String res = Moneta.lanciaMoneta();
				if(res.equals("testa")) {
					contaTesta++;
				} else {
					contaCroce++;
				}					
		    System.out.print("lancio numero : " + (i + 1) + " ");
			System.out.println(res);
			
		}//fine for
System.out.println("testa è uscito " + contaTesta );
		System.out.println("croce è uscito " + contaCroce );
		
		if(contaTesta > contaCroce) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		
	}	
	
}
