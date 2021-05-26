package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProvaLettura {

	public static void main(String[] args) {
		File f = new File("files/pizze.txt");
		
		Scanner sc;
		try {
			sc = new Scanner(f);
			String stringa = sc.nextLine();
			
			System.out.println(stringa);
			String[] split = stringa.split(",");
			System.out.println(split[1]);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
