package biblio.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import biblio.entities.Libro;
import biblio.services.LibroService;

@Controller
@RequestMapping("/mvc")
public class LibroMVC {
	
	@Autowired
	private LibroService ls;
	
	@RequestMapping("/libro/{id}")
	String getOne(@PathVariable("id") int id) {
		Libro l = ls.trovaUno(id);
		return "dettaglio";
	}
}
