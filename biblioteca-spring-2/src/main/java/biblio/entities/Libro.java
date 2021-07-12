package biblio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private int pagine;
	private int editore_id;
	private double prezzo_iva;
	private double prezzo;
	
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
	
	
}
