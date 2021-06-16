package model;

public class Giornale extends Pubblicazione {
	
	public Giornale(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Giornale [titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Pubblicazione o) {
		
		return this.titolo.compareTo(o.titolo);
	}
	
	
	
}
