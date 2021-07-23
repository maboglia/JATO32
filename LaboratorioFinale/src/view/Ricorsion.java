package view;

public class Ricorsion {

	public static void main(String[] args) {
		System.out.println(fattoriale(5));

	}
	
	//fibonacci
	//fattoriale
	//
	
	static int fattoriale(int n) {//5
		
		if(n == 0)
			return 1;
		else {
			System.out.println("In questo momento n vale: " + n);
			return n * fattoriale(n-1);
		}
		
	}
	
	

}
