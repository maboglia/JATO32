package gestione.pubblicazioni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import gestione.pubblicazioni.entities.Fumetto;

public interface FumettoDAO extends JpaRepository<Fumetto, Integer>{

}
