package gestione.editori.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import gestione.editori.entities.Editore;

public interface EditoreDAO extends JpaRepository<Editore, Integer>{

	Editore findByNome(String nome);
	
}
