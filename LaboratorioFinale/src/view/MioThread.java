package view;

public class MioThread extends Thread {

	@Override
	public void run() {
		
		int giri = 5;
		
		for (int i = 0; i < giri; i++) {
			System.out.println("Sono nel thread mio thread " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
