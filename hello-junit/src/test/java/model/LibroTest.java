package model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibroTest {

	
	@Test
	public void testaLibro() {
		
		Libro l = new Libro("io, robot", 123);
		
		assertTrue(l.getTitolo().startsWith("io"));
		
	}

	@Test
	public void testLibro() {
		
		Libro l = new Libro("io, robot", 123);
		
		assertFalse(l.getTitolo().startsWith("io"));
		
	}

	
	
	
}
