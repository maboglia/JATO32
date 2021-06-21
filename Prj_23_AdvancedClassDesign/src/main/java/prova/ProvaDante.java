package prova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProvaDante {

	public static void main(String[] args) {
		
		File divina = new File("files/divina.txt");
		
		List<String> totString = new ArrayList<>();
		Set<String> setString = new TreeSet<>();
		
		try {
			Scanner sc = new Scanner(divina);
			
			while (sc.hasNext()) {
				
				String temp = sc.next();
				
				temp = temp.replace(',', ' ');
				temp = temp.replace(';', ' ');
				temp = temp.replace('.', ' ');
				temp = temp.replace(':', ' ');
				temp = temp.replace('“', ' ');
				temp = temp.replace('”', ' ');
				temp = temp.replace('’', '\'');
				
				temp = temp.trim();
				
				temp = temp.toUpperCase();
				
				if (temp.length() > 3 ) {
					totString.add(temp);
					setString.add(temp);
				}
			}

			System.out.println(totString.size());
			System.out.println(setString.size());
			
			//setString.forEach(parola -> System.out.println(parola));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
