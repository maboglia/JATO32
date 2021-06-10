package model;

public class Quadrato extends Rettangolo {
	
	private Segmento lato;

	public Quadrato(Segmento lato) {
		super(lato, lato );
		this.lato = lato;
	}

	@Override
	public double perimetro() {
		System.out.println("Perimetro quadrato");
		return this.lato.calcolaLunghezza()*4;
	}

	@Override
	public double area() {
		return Math.pow(this.lato.calcolaLunghezza(), 2);
	}
	
	
	
	
	
	
	
}
