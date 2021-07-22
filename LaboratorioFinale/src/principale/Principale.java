package principale;

public class Principale {

	public static void main(String[] args) {
		
		if (args.length > 0) {
			System.out.println("Hai aggiunto: ");
			
			for (String string : args) {
				System.out.println("" + string);
			}
			
			
			
		}
		
		else {
			
			System.out.println("non hai aggiunto argomenti" + args[0].charAt(0));
		}

	}

}
