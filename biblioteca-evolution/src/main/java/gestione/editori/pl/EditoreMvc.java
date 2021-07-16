package gestione.editori.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gestione.editori.entities.Editore;
import gestione.editori.services.EditoreService;

@Controller
@RequestMapping(value = {"", "/mvc"})
public class EditoreMvc {

	@Autowired
	private EditoreService service;
	
	@RequestMapping(method = RequestMethod.GET)
	private String home(Model model) {
		model.addAttribute("titolo", "La mia libreria");
		return "home";
	}
	
	@RequestMapping(value="/editori/add",method = RequestMethod.GET)
	private String showFormEditore(Model model) {
		model.addAttribute("titolo", "Aggiungi editore");
		return "addEditore";
	}
	
	@RequestMapping(value="/editori/add",method = RequestMethod.POST)
	private String showFormEditore(@ModelAttribute Editore e,   Model model) {
		service.addEditore(e);
		model.addAttribute("titolo", "Aggiungi editore");
		return "redirect:/editori";
	}
	
	
	
	
	
	@RequestMapping(value="editori",method = RequestMethod.GET)
	private String getAll(Model model) {
		model.addAttribute("titolo", "Elenco editori");
		model.addAttribute("editori", service.getAll());
		return "editori";
	}	
}
