package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Filme;
import br.com.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @PostMapping(Constant.API_FILME)
    public void save(@RequestBody Filme filme){
        filmeService.save(filme);
    }

    @GetMapping(Constant.API_FILME)
    public List<Filme> findAll(){
        return filmeService.findAll();
    }

    @PutMapping(Constant.API_FILME)
    public void update (@RequestBody Filme filme){
        filmeService.save(filme);
    }

    @DeleteMapping(Constant.API_FILME + "/{id}")
    public void delete(@PathVariable("id") String id){
        filmeService.delete(id);
    }

    @GetMapping(Constant.API_FILME + "/{id}")
    public Optional<Filme> findById(@PathVariable("id") String id){
        return filmeService.findById(id);
    }
}
