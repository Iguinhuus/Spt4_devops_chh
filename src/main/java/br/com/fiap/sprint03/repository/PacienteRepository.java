package br.com.fiap.sprint03.repository;

import br.com.fiap.sprint03.model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
}
