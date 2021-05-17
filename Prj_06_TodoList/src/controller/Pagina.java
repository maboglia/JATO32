package controller;

import model.Nota;

public class Pagina {
	
	//array di Nota, proprieta della classe Pagina
	private Nota[] note;
	
	public Pagina() {
		this.note = new Nota[10];
	}
	
	public void addNota(int posizione, String descrizione) {
		//creo un nuovo oggetto di tipo Nota
		Nota n = new Nota(descrizione);
		//aggiungo l'oggetto n all'array di note, nella posizione indicata
		this.note[posizione] = n;
	}

	//getter della prop note
	public Nota[] getNote() {
		return this.note;
	}
	
	public String stampaPagina() {
		String pagina = "";
		
		for (int i = 0; i < note.length; i++) {
			if (note[i] != null)
				pagina += note[i].stampaNota();
			else
				pagina += "XXXX";
			pagina += "\n"+ "----------"+"\n";

		}
		
		pagina += "*****************************";
		
		return pagina;
		
	}
	
	public static void main(String[] args) {
		Pagina p = new Pagina();
		
		p.addNota(0, "latte");
		p.addNota(1, "pane");
		p.addNota(2, "olio");
		p.addNota(3, "sale");
		p.addNota(4, "uova");
		p.addNota(5, "burro");
		p.addNota(6, "insalata");
		p.addNota(7, "formaggio");
		p.addNota(8, "mele");
		p.addNota(9, "pere");
	
		p.getNote()[5].completaNota();
		
		System.out.println(  p.stampaPagina()  );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
