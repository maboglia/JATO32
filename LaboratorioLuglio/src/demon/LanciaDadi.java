package demon;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

import model.Dado;

public class LanciaDadi {

	public static void main(String[] args) {
		
		Dado d1=new Dado(), d2=new Dado();
		
		Map<Integer, Integer> risultati = new HashMap<Integer, Integer>();
		
		
		
		for (int i = 0; i < 1000000; i++) {
			d1.lancia();
			d2.lancia();
			
			if (d1.getValore() == d2.getValore()) {
//				System.out.println("hai vinto");
				if (risultati.get(d1.getValore())!=null) {
					risultati.put(d1.getValore(), risultati.get(d1.getValore()) + 1);
				} else 
					risultati.put(d1.getValore(), 1);
			}
		}
		
//		for (int i = 0; i < risultati.size(); i++) {
//			System.out.println("" + risultati.get(i) );
//		}
		
		risultati.forEach( (a,b) -> System.out.println("" + a + ": " +b));
		
		IntSummaryStatistics summaryStatistics = risultati.values().stream().mapToInt(a -> Integer.valueOf(a)).summaryStatistics();
	
		System.out.println(summaryStatistics);
	}
	
	
}
