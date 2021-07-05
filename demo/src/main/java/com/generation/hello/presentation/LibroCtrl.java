package com.generation.hello.presentation;

import java.util.ArrayList;
import java.util.List;

import com.generation.hello.model.Libro;

public class LibroCtrl {

	private List<Libro> libri;
	
	public LibroCtrl() {
		libri = new ArrayList<>();
		
		libri.add(new Libro("Io, robot", 123));
		libri.add(new Libro("Lei, robot", 124));
	}
	
	public List<Libro> getLibri() {
		return libri;
	}
	
	
	
	
}
