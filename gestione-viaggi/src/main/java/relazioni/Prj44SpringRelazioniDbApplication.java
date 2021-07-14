package relazioni;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Documento;
import relazioni.entities.Viaggio;
import relazioni.repos.DocRepo;
import relazioni.repos.ViaggioRepo;

@SpringBootApplication
public class Prj44SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj44SpringRelazioniDbApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner esempio1(ViaggioRepo viaggioRepo, DocRepo docRepo) {
//		
//		
//		return a -> {
//			
//			Viaggio v = new Viaggio("Roma");
//			Documento d = new Documento("locandina_roma.pdf");
//			
//			v.setDocumento(d);
//			d.setViaggio(v);
//			
//			viaggioRepo.save(v);
//			
//			
//			
//		};
//		
//	}

	@Bean
	public CommandLineRunner esempio2(ViaggioRepo viaggioRepo, DocRepo docRepo) {
		
		
		return a -> {
			
			Viaggio v = new Viaggio("Roma");
			Viaggio v2 = new Viaggio("Napoli");

			viaggioRepo.save(v);
			viaggioRepo.save(v2);			

			Documento d = new Documento("locandina_roma.pdf");

			Documento d2 = new Documento("foto_vesuvio.jpg");

			Documento d3 = new Documento("vademecum_viaggi.pdf");

			Documento d4 = new Documento("elenco_alberghi.xls");
			
			
			docRepo.saveAll(Arrays.asList(d, d2, d3, d4));
			
			v.getDocumenti().addAll(Arrays.asList(d, d3, d4));
			v2.getDocumenti().addAll(Arrays.asList(d2, d3, d4));
			
			
			viaggioRepo.save(v);
			viaggioRepo.save(v2);

			
			
		};
		
	}
		
	
	
}
