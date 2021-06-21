package model;

public class Motocicletta extends Veicolo implements Motorizzata{

	@Override
	void muovi() {
		System.out.println("muove velox");
		
	}

	@Override
	public void tipoAlimentazione() {
		System.out.println("alimentata a benzina");
		
	}

	@Override
	public double capacitaSerbatoio() {
		// TODO Auto-generated method stub
		return 20;
	}

	

	
	
}
