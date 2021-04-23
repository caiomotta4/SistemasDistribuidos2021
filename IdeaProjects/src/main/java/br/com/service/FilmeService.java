package br.com.service;

import br.com.model.Filme;
import br.com.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public void save(Filme filme){
        filmeRepository.save(filme);
    }

    public List<Filme> findAll (){
        return filmeRepository.findAll();
    }

    public Optional<Filme> findById(String id){
        return filmeRepository.findById(id);
    }

    public void delete(String id){
        filmeRepository.deleteById(id);
    }
}
