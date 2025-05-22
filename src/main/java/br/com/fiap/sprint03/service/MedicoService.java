
package br.com.fiap.sprint03.service;

import br.com.fiap.sprint03.model.DTO.MedicoDTO;
import br.com.fiap.sprint03.model.Medico;
import br.com.fiap.sprint03.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    // Converte de Medico -> MedicoDTO
    private MedicoDTO toDTO(Medico medico) {
        return new MedicoDTO(medico.getId(), medico.getNome(), medico.getTelefone(), medico.getEmail(), medico.getCrm());
    }

    // Converte de MedicoDTO -> Medico
    private Medico toEntity(MedicoDTO dto) {
        return new Medico(dto.getId(), dto.getNome(), dto.getTelefone(), dto.getEmail(), dto.getCrm());
    }

    public List<MedicoDTO> listarTodos() {
        System.out.println("Listando todos os médicos...");
        return medicoRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public MedicoDTO salvar(MedicoDTO medicoDTO) {
        System.out.println(">>> Tentando salvar médico:");
        System.out.println("ID: " + medicoDTO.getId());
        System.out.println("Nome: " + medicoDTO.getNome());
        System.out.println("Telefone: " + medicoDTO.getTelefone());
        System.out.println("Email: " + medicoDTO.getEmail());
        System.out.println("CRM: " + medicoDTO.getCrm());

        // Corrigido: se o ID estiver vazio, anula para deixar o Mongo gerar um novo
        if (medicoDTO.getId() != null && medicoDTO.getId().isBlank()) {
            medicoDTO.setId(null);
        }

        Medico medico = toEntity(medicoDTO);
        Medico salvo = medicoRepository.save(medico);

        System.out.println(">>> Médico salvo com ID: " + salvo.getId());

        return toDTO(salvo);
    }

    public Optional<MedicoDTO> buscarPorId(String id) {
        System.out.println("Buscando médico por ID: " + id);
        return medicoRepository.findById(id).map(this::toDTO);
    }

    public void excluir(String id) {
        System.out.println("Excluindo médico com ID: " + id);
        if (!medicoRepository.existsById(id)) {
            throw new RuntimeException("Médico não encontrado para exclusão");
        }
        medicoRepository.deleteById(id);
    }

    public MedicoDTO atualizar(MedicoDTO medicoDTO) {
        System.out.println("Atualizando médico com ID: " + medicoDTO.getId());
        if (medicoDTO.getId() == null || !medicoRepository.existsById(medicoDTO.getId())) {
            throw new IllegalArgumentException("Médico não encontrado para atualização");
        }
        Medico medico = toEntity(medicoDTO);
        return toDTO(medicoRepository.save(medico));
    }
}