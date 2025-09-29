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

import br.com.projetoclinica.clinica.entity.Dentista;
import br.com.projetoclinica.clinica.service.DentistaService;


@Controller
@RequestMapping("/dentistas")
public class DentistaController {
    
    // Injeção de dependencia da service dos dentistas
    @Autowired
    private DentistaService dentistaService;

    // Método para salvar dentistas
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Dentista dentista){
        dentistaService.save(dentista);
        return "redirect:/dentistas/listar";
    }
    // Método para listar todos os dentista
    @GetMapping("/listar")
        public String listar(Model model){
            List<Dentista> dentistas = dentistaService.findAll();
            model.addAttribute("dentistas", dentistas);
            return "dentista/listasDentistas";
        }
    
    // Método para abrir o formulário de dentistas
    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("dentista", new Dentista());
        return "dentista/formularioDentista";
    }

    // Método para abrir o formulário de edição de dentistas
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable ("id") Integer id, Model model){
        Dentista dentista = dentistaService.findById(id);
        model.addAttribute("dentista", dentista);
        return "dentista/formularioDentista";
    }

    // Método para excluir um dentista
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
        dentistaService.deleteById(id);
        return "redirect:/dentistas/listar";
    }
    
    
   
    
}

