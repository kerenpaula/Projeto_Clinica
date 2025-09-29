package br.com.projetoclinica.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoclinica.clinica.entity.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista, Integer> {
    
}