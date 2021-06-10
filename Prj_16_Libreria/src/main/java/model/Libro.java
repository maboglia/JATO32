package model;

public class Libro {

	private int id;
	private String titolo;
	private int pagine;
	private double prezzo;
	private static int contatore = 1;
	
	/**
	 * Costrutore del oggetto libro.
	 * @param titolo - passare una Stringa come titolo del libro.
	 * @param pagine - passare un intero come numero di pagine.
	 */
	public Libro(String titolo, int pagine, double prezzo) {
		this.titolo = titolo;
		this.pagine = pagine;
		this.prezzo = prezzo;
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

	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", pagine=" + pagine + "]";
	}
	
	
}