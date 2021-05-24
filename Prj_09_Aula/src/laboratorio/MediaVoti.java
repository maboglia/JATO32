package laboratorio;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaVoti {

	public static void main(String[] args) {
		
		ArrayList<Integer> voti = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		int somma = 0;
		double media = 0.0;
		int v = 0;
		boolean gira = true;
		
		while (gira) {
			
			System.out.println("inserisci il voto");
			System.out.println("0 per uscire");
			v = s.nextInt();
			s.nextLine();//mando a capo la console
			
			if (v<=0) {
				gira = false;
				break;
			}			
			
			voti.add(v);

		}
		
		for (int voto : voti) {
			System.out.println("voto: "+voto);
			somma = somma + voto;
			//somma += voto;
		}
		
		media = (double) somma / voti.size();
		
		System.out.println("La media aritmetica dei voti inseriti è: " + media);
		
		
		
		
	}
	
}
