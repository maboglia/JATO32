package model;

import java.time.LocalDateTime;

public class Movimento {

	private LocalDateTime data;
	private String descrizione;
	private double amount;

	public Movimento(String descrizione, double amount) {
		this.data = LocalDateTime.now();
		this.descrizione = descrizione;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Movimento [" + data + ", " + descrizione + ", €" + amount + "]";
	}
	
	
	
}
