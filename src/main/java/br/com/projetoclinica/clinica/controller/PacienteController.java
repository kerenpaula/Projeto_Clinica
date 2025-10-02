package br.com.projetoclinica.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoclinica.clinica.entity.Paciente;
import br.com.projetoclinica.clinica.service.PacienteService;


@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    
    // Injeção de dependencia da service dos pacientes
    @Autowired
    private PacienteService pacienteService;

    // Método para salvar dentistas
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Paciente paciente){
        pacienteService.save(paciente);
        return "redirect:/pacientes/listar";
    }
    // Método para listar todos os dentista
    @GetMapping("/listar")
        public String listar(Model model){
            List<Paciente> pacientes = pacienteService.findAll();
            model.addAttribute("pacientes", pacientes);
            return "pacientes/listarPacientes";
        }
    
    // Método para abrir o formulário de dentistas
    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("paciente", new Paciente());
        return "pacientes/formularioPaciente";
    }

    // Método para abrir o formulário de edição de dentistas
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable ("id") Integer id, Model model){
        Paciente paciente = pacienteService.findById(id);
        model.addAttribute("paciente", paciente);
        return "pacientes/formularioPaciente";
    }

    // Método para excluir um dentista
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
        pacienteService.deleteById(id);
        return "redirect:/pacientes/listar";
    }
    
    
   
    
}

