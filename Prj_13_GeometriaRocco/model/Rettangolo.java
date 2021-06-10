package model;

public class Rettangolo extends Forma {
	
	private Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		System.out.println("Sono nel costruttore del rettangolo");
	}
	
	public double perimetro() {
		System.out.println("Perimetro rettangolo");
		return (base.calcolaLunghezza() + altezza.calcolaLunghezza())*2;
	}
	
	public double area() {
		return (base.calcolaLunghezza()*altezza.calcolaLunghezza());
		
	}
	
	
}
