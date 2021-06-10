package view;

import java.util.ArrayList;

import model.Forma;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class Geometria {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		Punto p2 = new Punto(5,1);
		Punto p3 = new Punto(1,1);
		System.out.println(p2);
		
		p1.setX(1);
		p1.setY(4);
		
		
		System.out.println(p1);
		
		
		Segmento ab = new Segmento(p1, p2);
		System.out.println(ab.calcolaLunghezza());
		
		Triangolo t = new Triangolo(p1, p2, p3);
		System.out.println(t.perimetro());
		System.out.println(t.area());
		
		
		Rettangolo r = new Rettangolo(new Segmento(p3, p2), new Segmento(p3, p1));
		System.out.println(r.perimetro());
		System.out.println(r.area());
		
		
		Quadrato q = new Quadrato(ab);
		System.out.println(q.perimetro());
		System.out.println(q.area());
		
		
		
		ArrayList<Forma> figure = new ArrayList<Forma>();
		figure.add(t);
		figure.add(r);
		figure.add(q);
		
		for (Forma forma : figure) {
//			if(forma instanceof Triangolo) {
//				System.out.println(((Triangolo) forma).perimetro());
//			}
			System.out.println(forma.perimetro());
		}
	}

}
