package controller;

public class Taccuino {

	private Pagina[] pagine;
	
	public Taccuino() {
		System.out.println("Taccuino costruito");
		this.pagine = new Pagina[10];
	}
	
	public void addPagina(int posizione, Pagina p) {
		this.pagine[posizione] = p;
	}
	
	public Pagina getPagina(int posizione) {
		return this.pagine[posizione];
	}
	
	public Pagina[] getPagine() {
		return pagine;
	}
	
}
