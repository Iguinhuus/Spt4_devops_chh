
package br.com.fiap.sprint03.controller;

import br.com.fiap.sprint03.model.DTO.MedicoDTO;
import br.com.fiap.sprint03.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public String listarMedicos(Model model) {
        List<MedicoDTO> medicos = medicoService.listarTodos();
        model.addAttribute("medicos", medicos);
        return "medicos/listar";
    }

    @GetMapping("/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("medicoDTO", new MedicoDTO());
        return "medicos/form";
    }

    @PostMapping("/salvar")
    public String salvarMedico(@ModelAttribute("medicoDTO") MedicoDTO medicoDTO) {
        try {
            // Corrigido: garantir que só atualiza se o ID não for nulo e não for vazio
            if (medicoDTO.getId() == null || medicoDTO.getId().isBlank()) {
                medicoService.salvar(medicoDTO);
            } else {
                medicoService.atualizar(medicoDTO);
            }
        } catch (Exception e) {
            e.printStackTrace(); // loga o erro no console
            throw new RuntimeException("Erro ao salvar médico: " + e.getMessage());
        }

        return "redirect:/medicos";
    }

    @GetMapping("/editar/{id}")
    public String editarMedico(@PathVariable String id, Model model) {
        MedicoDTO medicoDTO = medicoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
        model.addAttribute("medicoDTO", medicoDTO);
        return "medicos/form";
    }

    @GetMapping("/excluir/{id}")
    public String excluirMedico(@PathVariable String id) {
        medicoService.excluir(id);
        return "redirect:/medicos";
    }
}
