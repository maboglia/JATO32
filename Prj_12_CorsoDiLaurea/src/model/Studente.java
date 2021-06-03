package model;

import java.util.ArrayList;

public class Studente {

	private String nome;
	private int nMatricola;
	private ArrayList<Esame> esamiDare;
	private ArrayList<Esame> esamiSostenuti;

	public Studente(String nome, int nMatricola, ArrayList<Esame> esamiDare) {
		this.nome = nome;
		this.nMatricola = nMatricola;
		this.esamiDare = esamiDare;
		this.esamiSostenuti = new ArrayList<>();
	}

	public Studente(String nome, int nMatricola) {
		this.nome = nome;
		this.nMatricola = nMatricola;
		this.esamiDare = new ArrayList<>();
		this.esamiSostenuti = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnMatricola() {
		return nMatricola;
	}

	public void setnMatricola(int nMatricola) {
		this.nMatricola = nMatricola;
	}

	public ArrayList<Esame> getEsamiDare() {
		return esamiDare;
	}

	public void setEsamiDare(ArrayList<Esame> esamiDare) {
		this.esamiDare = esamiDare;
	}

	public ArrayList<Esame> getEsamiSostenuti() {
		return esamiSostenuti;
	}

	public void setEsamiSostenuti(ArrayList<Esame> esamiSostenuti) {
		this.esamiSostenuti = esamiSostenuti;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", nMatricola=" + nMatricola + ", esamiDare=" + esamiDare
				+ ", esamiSostenuti=" + esamiSostenuti + "]";
	}
	
	
	
	
}
