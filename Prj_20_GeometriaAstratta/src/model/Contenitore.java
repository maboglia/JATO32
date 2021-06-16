package model;

import java.util.ArrayList;

public class Contenitore {

	private ArrayList<FiguraGeometrica> figure = new ArrayList<>();
	
	public void addFigura(FiguraGeometrica f) {
		figure.add(f);
	}
	
	public ArrayList<FiguraGeometrica> getFigure() {
		return figure;
	}
}
