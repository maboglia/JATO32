package relazioni.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	private String genere;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name= "rel_viaggi_docs", joinColumns = {
			@JoinColumn(name="viaggi_id",referencedColumnName = "id",nullable = false, updatable = false)
	}, inverseJoinColumns = { @JoinColumn( name="doc_id",referencedColumnName = "id",nullable = false, updatable = false   )    })
	private Set<Documento> documenti = new HashSet<>();
	
	
	

	public Set<Documento> getDocumenti() {
		return documenti;
	}

	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
	}

	public Viaggio() {}
	
	public Viaggio(String destinazione) {
		this.destinazione = destinazione;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", destinazione=" + destinazione + "]";
	}
	
	
	
}
