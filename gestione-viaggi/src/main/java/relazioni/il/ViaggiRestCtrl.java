package relazioni.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relazioni.entities.Viaggio;
import relazioni.repos.ViaggioRepo;

@RestController
@RequestMapping("/api")
public class ViaggiRestCtrl {

	@Autowired
	private ViaggioRepo repo;
	
	@GetMapping("")
	public List<Viaggio> getViaggi(){
		return repo.findAll();
	}
	
	
}
