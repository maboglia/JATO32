package view;

public class SfondareArray {

	public static void main(String[] args) {
		
		int[] voti = {23,25,27,29};
		double totale = 0;
		try {
			for (int i = 0; i < voti.length; i++) {
				System.out.println("il voto è: " + voti[i]);
				totale += voti[i];
			}
		int c = 0;
			System.out.println(5 / 0);
		
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("hai sfondato l'array");
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Spiacente sono rimaste 0 caramelle");
			System.err.println("Vuoi un lecca lecca?");
		}
		catch (Exception e) {
			System.err.println("Purtroppo si è verificata un'eccezione...");
		}
		System.out.println("la media è: " + (totale/voti.length));

	}

}
