package model;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {

	private static int counter = 0;
	protected String nome;
	protected String contorno;
	
	
	public FiguraGeometrica() {
		counter++;
		this.nome = "Forma";
		this.contorno = " il Perimetro";
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public abstract double perimetro();
	
	@Override
	public String toString() {
		
		return "Data la figura: " + this.nome + " " + this.contorno +" è: " +
		this.perimetro();
	}

	@Override
	public int compareTo(FiguraGeometrica fg) {
		if ( this.perimetro() - fg.perimetro() == 0) {
			return 0;
		} else if (this.perimetro() - fg.perimetro() < 0 ) {
			return -1;
		} else 
			return 1;
	}
	
}
