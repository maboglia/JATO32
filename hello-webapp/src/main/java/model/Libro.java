package model;

public class Libro extends Pubblicazione {

	private int id, pagine, id_editore;

	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	public Libro(int id, int pagine, int id_editore, String titolo, double prezzo) {
		this.id = id;
		this.pagine = pagine;
		this.id_editore = id_editore;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getPagine() {
		return pagine;
	}


	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getId_editore() {
		return id_editore;
	}


	public void setId_editore(int id_editore) {
		this.id_editore = id_editore;
	}





	@Override
	public int compareTo(Pubblicazione o) {
		
		return this.titolo.compareTo(o.titolo);
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", pagine=" + pagine + ", id_editore=" + id_editore + ", titolo=" + titolo
				+ ", prezzo=" + prezzo + "]";
	}

	

}
