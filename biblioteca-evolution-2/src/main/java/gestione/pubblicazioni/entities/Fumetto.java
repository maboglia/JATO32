package gestione.pubblicazioni.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fumetti")
public class Fumetto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String genere;

	public Fumetto() {}
	
	public Fumetto(int id, String nome, String genere) {

		this.id = id;
		this.nome = nome;
		this.genere = genere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Fumetto [id=" + id + ", nome=" + nome + ", genere=" + genere + "]";
	}
	
	
	
}
