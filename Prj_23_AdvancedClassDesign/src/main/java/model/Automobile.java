package model;

public class Automobile extends Veicolo implements Motorizzata {

	@Override
	void muovi() {
		System.out.println("muove medio");

	}

	@Override
	public void tipoAlimentazione() {
		System.out.println("A");
		
	}

	@Override
	public double capacitaSerbatoio() {
		// TODO Auto-generated method stub
		return 40;
	}

}
