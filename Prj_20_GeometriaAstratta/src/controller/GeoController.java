package controller;

import java.util.Collections;

import model.Cerchio;
import model.Contenitore;
import model.FiguraGeometrica;
import model.Rettangolo;

public class GeoController {

	
	public static void main(String[] args) {
		Contenitore c = new Contenitore();
		c.addFigura(new Cerchio(5));
		c.addFigura(new Rettangolo(3, 8));
		c.addFigura(new Cerchio(6));
		c.addFigura(new Rettangolo(4, 7));
		c.addFigura(new Rettangolo(2, 9));
		c.addFigura(new Cerchio(7));
		c.addFigura(new Rettangolo(5, 6));
		
		Collections.sort(c.getFigure());
		
		for (FiguraGeometrica fg : c.getFigure()) {
			System.out.println(fg);
		}
		
		
		
	}
	
}
