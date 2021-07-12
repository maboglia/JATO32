package biblio.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import biblio.services.AutoreService;

@Controller
@RequestMapping("/autori")
public class LibroMVC {

	
	@Autowired
	private AutoreService as;
	
	@RequestMapping("")
	public String getAutori(Model model) {
		System.out.println("pippo");
		model.addAttribute("autori", as.dammiTuttiGliAutori());
		return "autori";
	}
	
}
