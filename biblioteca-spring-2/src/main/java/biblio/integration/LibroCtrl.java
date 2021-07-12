package biblio.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblio.entities.Libro;
import biblio.services.LibroService;

@RestController
@RequestMapping("/api/libri")
public class LibroCtrl {

	
	@Autowired
	private LibroService ls;
	
	@GetMapping("")
	List<Libro> tutti(){
		return ls.trovaTutti();
	}
	
	@GetMapping("/{id}")
	Libro trovaUno(@PathVariable("id") int id) {
		return ls.trovaUno(id);
	}
	
	@GetMapping("/autore/{id}")
	List<Libro> trovaLibriAutore(@PathVariable("id") int id) {
		return ls.libriAutore(id);
	}	
	
}
