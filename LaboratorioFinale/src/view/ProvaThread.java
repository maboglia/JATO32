package view;

public class ProvaThread {

	public static void main(String[] args) {
		
		MioThread mt = new MioThread();//thread secondario
		mt.start();
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Sono la classe demo " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
