package model;

public class Cerchio extends FiguraGeometrica {

	private int raggio;
	
	public Cerchio(int raggio) {
		this.raggio = raggio;
		this.nome = "Cerchio";
		this.contorno = " la Circonferenza";
	}
	
	
	@Override
	public double perimetro() {
		
		return Math.PI * 2 * this.raggio;
	}

	public double circonferenza() {
		return this.perimetro();
	}
		
}
