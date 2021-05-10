package view;

public class ArrayStringhe {

	public static void main(String[] args) {
		
		String[] nani = {
				"pisolo",
				"eolo",
				"mammolo",
				"cucciolo",
				"brontolo",
				"dotto",
				"gongolo",
				};

		for (int i = 0; i < nani.length; i++) {
			if (nani[i].length()>5)
				System.out.println(nani[i].charAt(5) );
			System.out.println( nani[i] + " contiene " + nani[i].length()  + " caratteri."       );
		}
		
	}

}
