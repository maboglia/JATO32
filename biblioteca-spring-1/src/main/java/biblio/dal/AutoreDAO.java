package biblio.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import biblio.entities.Autore;

public interface AutoreDAO extends JpaRepository<Autore, Integer> {

}
