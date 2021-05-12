package model;

public class Player {

	String nome;
	int score;
	

	//metodo costruttore, serve per costruire l'oggetto
	public Player() {
		score = 0;
		nome = "player 1";
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void modificaPunteggio(int incremento) {
		score = score + incremento;
	}
	
}
