package biblio.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import biblio.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

//List<Libro> findByAutori(String autori);
	
}
