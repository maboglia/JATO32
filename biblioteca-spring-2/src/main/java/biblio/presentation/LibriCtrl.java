package biblio.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libri")
public class LibriCtrl {

	@GetMapping("")
	public String elenco(Model model) {

		List<String> libri = new ArrayList<String>();
		
		libri.add("io, robot");
		libri.add("i malavoglia");
		libri.add("i promessi sposi");
		
		
		model.addAttribute("libri", libri);
		model.addAttribute("titolo", "Libreria");
		
		return "libri";
	}
	
	
}
