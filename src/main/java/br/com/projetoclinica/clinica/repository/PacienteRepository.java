package br.com.projetoclinica.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoclinica.clinica.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    
}