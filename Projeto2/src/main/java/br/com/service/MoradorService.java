package br.com.service;

import br.com.model.Morador;
import br.com.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {

    @Autowired
    private MoradorRepository moradorRepository;

    public List<Morador> findAll(){
        return moradorRepository.findAll();
    }

    public void save(Morador morador){
        moradorRepository.save(morador);
    }

    public Morador findById(String id){
        return moradorRepository.findById(id).get();
    }
}
