package model;

public class Moneta {
	public static final byte N_FACCE = 2;
	public static String[] faccia = {"testa","croce"};
	
	public static String lanciaMoneta() {
		int i = (int)(Math.random() * N_FACCE);
		
		return  faccia[i];
	}
}
