package model;

public class Argomento {

	//proprietà, attributo, field
	private String testo;

	public Argomento() {}
	
	public Argomento(String testo) {
		this.testo = testo;
	}
	
	
	//metodo getter - accessore - serve per ritornare il valore della proprietà
	//testo è di tipo String -> questo metodo quindi ritorna una stringa
	public String getTesto() {
		return testo;
	}

	//metodo setter - mutatore - serve per modificae dall'esterno la proprietà testo
	//testo è un String, quindi questo metodo prende in argomento una stringa per dare un nuovo valore alla proprietà
	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	
	
}
