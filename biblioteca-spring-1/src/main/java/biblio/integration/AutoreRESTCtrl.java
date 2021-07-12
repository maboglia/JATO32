package biblio.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblio.entities.Autore;
import biblio.services.AutoreService;

@RestController
@RequestMapping("/api/autori")
public class AutoreRESTCtrl {

	@Autowired
	private AutoreService servizio;
	
	@GetMapping("")
	public List<Autore> findAutori(){
		return servizio.dammiTuttiGliAutori();
	}
	
	@GetMapping("/{id}")
	public Autore findAutore(@PathVariable int id) {
		return servizio.unSoloAutore(id);
	}
	
}
