package biblio.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import biblio.entities.Libro;
import biblio.services.LibroService;

@Controller
@RequestMapping("/mvc/libri")
public class LibroMVC {
	
	@Autowired
	private LibroService ls;
	
	@RequestMapping("")
	public String elenco(Model m) {
		List<Libro> libri = ls.trovaTutti();
		
		m.addAttribute("libri", libri);
		
		return "elenco";
	}
	
	
	
	
	@RequestMapping("/{id}")
	public String getOne(@PathVariable("id") int id, Model m) {
		Libro l = ls.trovaUno(id);
		m.addAttribute("libro", l);
		return "dettaglio";
	}
}
