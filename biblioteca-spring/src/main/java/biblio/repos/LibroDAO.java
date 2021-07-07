package biblio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import biblio.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
