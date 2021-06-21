package entities;

public class Libro {
	private int nPagine;
	private String nome;
	private int id_editore;
	private double prezzo;
	private double prezzo_iva;
	private int id_libro;
	
	public Libro(int nPagine, String nome, int id_editore, double prezzo, double prezzo_iva, int id_libro) {
		
		this.nPagine = nPagine;
		this.nome = nome;
		this.id_editore = id_editore;
		this.prezzo = prezzo;
		this.prezzo_iva = prezzo_iva;
		this.id_libro = id_libro;
	}
	
	public Libro() {
		
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_editore() {
		return id_editore;
	}

	public void setId_editore(int id_editore) {
		this.id_editore = id_editore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getPrezzo_iva() {
		return prezzo_iva;
	}

	public void setPrezzo_iva(double prezzo_iva) {
		this.prezzo_iva = prezzo_iva;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	@Override
	public String toString() {
		return "Libro [nPagine=" + nPagine + ", nome=" + nome + ", id_editore=" + id_editore + ", prezzo=" + prezzo
				+ ", prezzo_iva=" + prezzo_iva + ", id_libro=" + id_libro + "]";
	}
	
	

}
