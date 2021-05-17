package view;

import java.util.Arrays;

public class ProvaArray {

	public static void main(String[] args) {
		String[] frutti = {"mele", "pere", "banane", "limoni"};

		System.out.println(frutti);
		
		Arrays.sort(frutti);
		
		int binarySearch = Arrays.binarySearch(frutti, "melone");
		
		System.out.println(binarySearch);
		
		for (String frutto : frutti) {
			System.out.println(frutto);
		}
		
	}

}
