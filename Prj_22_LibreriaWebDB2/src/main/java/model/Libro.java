package model;

public class Libro {
	private int id;
	private String titolo;
	private int pagine;
	private int editore_id;
	private double prezzo_iva;
	private double prezzo;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(int id, String titolo, int pagine, int editore_id, double prezzo_iva, double prezzo) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.pagine = pagine;
		this.editore_id = editore_id;
		this.prezzo_iva = prezzo_iva;
		this.prezzo = prezzo;
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

	public int getEditore_id() {
		return editore_id;
	}

	public void setEditore_id(int editore_id) {
		this.editore_id = editore_id;
	}

	public double getPrezzo_iva() {
		return prezzo_iva;
	}

	public void setPrezzo_iva(double prezzo_iva) {
		this.prezzo_iva = prezzo_iva;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", pagine=" + pagine + ", editore_id=" + editore_id
				+ ", prezzo_iva=" + prezzo_iva + ", prezzo=" + prezzo + "]";
	}
	
	
	

}