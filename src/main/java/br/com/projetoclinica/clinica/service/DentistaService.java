package br.com.projetoclinica.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoclinica.clinica.entity.Dentista;
import br.com.projetoclinica.clinica.repository.DentistaRepository;

@Service
public class DentistaService {
    // Ingeção de dependencia do repositório de dentistas
    @Autowired
    private DentistaRepository dentistaRepository;

    // Método para salvar um dentista
    public Dentista save(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    // Método para listar todos os dentistas
    public List<Dentista> findAll() {
        return dentistaRepository.findAll();
    }

    // Método para excluir um dentista

public void deleteById (Integer id){
    dentistaRepository.deleteById(id);
}

// Método para buscar um dentista

public Dentista findById (Integer id){
    return dentistaRepository.findById(id).orElse(null);
}

}

