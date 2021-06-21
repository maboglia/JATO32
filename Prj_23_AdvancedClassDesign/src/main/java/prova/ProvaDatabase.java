package prova;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import db.EditoreDAO;
import db.EditoreDAOImpl;
import model.Editore;

public class ProvaDatabase {

	public static void main(String[] args) {
		

		EditoreDAO ed = new EditoreDAOImpl();
		
		//ed.addEditore(new Editore(20, "Feltrinelli"));
		//ed.getAll().forEach(e -> System.out.println(e));
		
		Set<Editore> nomi = new HashSet<>(ed.getAll());
		
		System.out.println("--------editori ordinati-------");
		
		//nomi.forEach(n -> System.out.println(n.getNome()));
		
		System.out.println(ed.getOneById(3).getNome());//Ei
		
		
		
		
		
		
		
	}

}
