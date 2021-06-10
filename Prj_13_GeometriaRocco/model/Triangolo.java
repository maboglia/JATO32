package model;

public class Triangolo extends Forma {
	
	private Punto a,b,c;
	private Segmento ab, bc, ac;
	
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	
	}
	
	public double perimetro() {
		System.out.println("Perimetro triangolo: ");
		return ab.calcolaLunghezza() + bc.calcolaLunghezza() + ac.calcolaLunghezza();
	}
	
	public double area() {
		double sp = this.perimetro()/2;
		return Math.sqrt(sp*(sp-ab.calcolaLunghezza())*(sp-ac.calcolaLunghezza())*(sp-bc.calcolaLunghezza()));
	}
	
	
}
