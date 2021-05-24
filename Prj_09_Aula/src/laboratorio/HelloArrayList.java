package laboratorio;

import java.util.ArrayList;

public class HelloArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> reDiRoma = new ArrayList<>();
		
		reDiRoma.add("romolo");
		reDiRoma.add("numa pompilio");
		reDiRoma.add("tullio ostilio");
		reDiRoma.add("anco marzio");
		reDiRoma.add("tarquinio prisco");
		
		System.out.println("fino ad ora i re di roma sono: " + reDiRoma.size());
		System.out.println("Il primo re di roma è: " + reDiRoma.get(0));
		
//		for (int i = 0; i < reDiRoma.size(); i++) {
//			System.out.println(reDiRoma.get(i));
//		}
		reDiRoma.set(2, "totti");
		for (String re : reDiRoma) {
			System.out.println(re);
		}
		

	}

}
