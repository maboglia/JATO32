package view;

public class ArrayInteri {

	public static void main(String[] args) {
		
		/*
		int[] voti = new int[5];//0,1,2,3,4 zero-based
		
		voti[0] = -24;
		voti[1] = 30;
		voti[2] = 30;
		voti[3] = 30;
		voti[4] = 30;
		*/
		//shorthand inizializzare array
		int[] voti = {24,26,22,28,30};
		voti[3] = 24;
		
		
		int somma = 0;
		int lunghezza = voti.length;
		
		for(int i = 0; i < lunghezza; i++) {
			//
			System.out.println("Somma prima dell'addizione corrente " + somma);
			somma = somma + voti[i];
			System.out.println("Somma dopo l'addizione corrente " + somma);
			System.out.println("--------------------");
		}
		System.out.println( (double) somma/lunghezza);

	}

}
