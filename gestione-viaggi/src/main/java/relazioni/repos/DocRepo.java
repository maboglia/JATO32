package relazioni.repos;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Documento;

public interface DocRepo extends CrudRepository<Documento, Integer> {

}
