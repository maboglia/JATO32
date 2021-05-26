package view;

public class AritmeticaSbagliata {

	public static void main(String[] args) {
		
		int bambini = 5;
		int caramelle = 0;
		
		try {
			System.out.println(bambini/caramelle);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Spiacente sono rimaste 0 caramelle");
			System.err.println("Vuoi un lecca lecca?");
		}
		
		System.out.println("programma concluso");

	}

}
