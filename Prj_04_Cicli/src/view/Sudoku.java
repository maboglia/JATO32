package view;

public class Sudoku {

	// final: valore finale della variabile -> costante
	private static final int RIGHE_HR = 9, RIGHE_VR = 9;
	private static final String NOME = "Super sudoku";
	
	
	public static void main(String[] args) {
		
		System.out.println(NOME);
		
		for (int i = 0; i < RIGHE_VR; i++) {
			stampaRiga();
			System.out.println();
		}
		

	}

	private static void stampaRiga() {
		
		for(int i=1; i<= RIGHE_HR; i++) {
			double d = Math.random();
			
			//faccio il casting : cast: forzatura
			int casuale = 1 + (int) (d * RIGHE_HR);
			System.out.print(casuale + "\t");
		}
		
	}

	
	
}
