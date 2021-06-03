package model;

import java.util.ArrayList;

public class CorsoDiLaurea {

	private String nomeCDL;
	private ArrayList<Studente> studentiIscritti;
	
	private static int matricolatore = 1;
	private static final int NUM_CREDITI = 180;//costante

	
	public CorsoDiLaurea(String nomeCDL) {
		this.studentiIscritti = new ArrayList<>();
		this.nomeCDL = nomeCDL;
	}

	public void incrementaContatore() {
		matricolatore++;
	}
	
	public String getNomeCDL() {
		return nomeCDL;
	}


	public ArrayList<Studente> getStudentiIscritti() {
		return studentiIscritti;
	}


	public static int getMatricolatore() {
		return matricolatore;
	}


	public static int getNumCrediti() {
		return NUM_CREDITI;
	}


	@Override
	public String toString() {
		return "CorsoDiLaurea [nomeCDL=" + nomeCDL + ", studentiIscritti=" + studentiIscritti + "]";
	}

	
	
	
	
	
}
