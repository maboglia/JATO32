package model;

public class Rettangolo extends FiguraGeometrica{

	private int base, altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		this.nome = "Rettangolo";
	}
	
	@Override
	public double perimetro() {
		return 2*(this.base + this.altezza);
	}
		
}
