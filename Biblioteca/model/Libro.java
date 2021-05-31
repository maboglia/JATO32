package model;

public class Libro {

	private int id;
	private String titolo;
	private int pagine;
	private static int contatore = 1;
	
	/**
	 * Costrutore del oggeto libro.
	 * @param titolo - passare una Stringa come titolo del libro.
	 * @param pagine - passare un intero come numero di pagine.
	 */
	public Libro(String titolo, int pagine) {
		this.titolo = titolo;
		this.pagine = pagine;
		this.id = contatore++;
		System.out.println("Libro Creato! "+ titolo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", pagine=" + pagine + "]";
	}
	
	
}
