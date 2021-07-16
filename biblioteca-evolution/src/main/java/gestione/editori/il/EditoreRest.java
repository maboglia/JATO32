package gestione.editori.il;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestione.editori.entities.Editore;
import gestione.editori.services.EditoreService;

@RestController
@RequestMapping(value = {"/api", "/rest"})
public class EditoreRest {

	@Autowired
	private EditoreService service;
	
	@GetMapping(value = {"", "/{nome}"})
	public List<Editore> getAll(@PathVariable(required = false) String nome){
		
		if (nome != null) {
			List<Editore> list = new ArrayList<>();
			list.add(service.getByName(nome));
			return list;
		}
			else 
			return service.getAll();
		
	}
	
	@PostMapping(value = "", consumes = "application/json")
	public Editore addEditore(@RequestBody Editore e) {
		return service.addEditore(e);
	}
	
	@PutMapping(value = "", consumes = "application/json")
	public Editore updEditore(@RequestBody Editore e) {
		return service.updEditore(e);
	}
	
	@DeleteMapping("/{id}")
	public String delEditore(@PathVariable int id) {
		service.delById(id);
		return "{}";
	}
	
}
