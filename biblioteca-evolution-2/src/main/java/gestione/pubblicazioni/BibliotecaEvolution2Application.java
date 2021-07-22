package gestione.pubblicazioni;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestione.pubblicazioni.entities.Fumetto;
import gestione.pubblicazioni.service.FumettoService;

@SpringBootApplication
@RestController
public class BibliotecaEvolution2Application {

	@Autowired
	private FumettoService fs;
	
	@RequestMapping("fumetti")
	public List<Fumetto> trovaTutti(){
		return fs.getAll();
	}
	
	@PostConstruct
	void init() {
		fs.add(new Fumetto(0,"La mano rossa", "avventura"));
		fs.add(new Fumetto(0,"Agente speciale Alfa", "fantascienza"));
		fs.add(new Fumetto(0, "L'alba dei morti viventi", "horror comic"));
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaEvolution2Application.class, args);
	}

}
