package br.com.projetoclinica.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoclinica.clinica.entity.Paciente;
import br.com.projetoclinica.clinica.repository.PacienteRepository;

@Service
public class PacienteService {
// ingeção de dependencia do repositorio de pacientes
    @Autowired
    private PacienteRepository pacienteRepository;

    // método para salvar um paciente
    public void save(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    // método para listar um paciente
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    // método para buscar um paciente
    public Paciente findById(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    // método para excluir um paciente
    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
