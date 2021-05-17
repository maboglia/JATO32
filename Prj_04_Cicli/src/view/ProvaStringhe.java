package view;

public class ProvaStringhe {

	public static void main(String[] args) {
		
		String nome = "Edoardo";
		
		System.out.println(nome.length());
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println(nome.indexOf("z"));

	}

}
