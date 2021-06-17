package br.com.controller;

import br.com.model.Morador;
import br.com.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoradorController {

    @Autowired
    private MoradorService moradorService;

    @GetMapping("/api/morador")
    public List<Morador> findAll(){
        return moradorService.findAll();
    }
/*
    @PostMapping("/api/morador")
    public void save(Morador morador){
        morador.setMedia(calcularMedia(morador.getNota1(), morador.getNota2(), morador.getNota3()));
        moradorService.save(morador);
    }
*/
    @GetMapping("/api/morador/{id}")
    @Cacheable("morador")
    public Morador findById(@PathVariable("id") String id){
        System.out.println("Find Information.. " + id);
        return moradorService.findById(id);
    }

}
