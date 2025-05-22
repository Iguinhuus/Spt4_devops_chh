package br.com.fiap.sprint03.repository;

import br.com.fiap.sprint03.model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {
}
