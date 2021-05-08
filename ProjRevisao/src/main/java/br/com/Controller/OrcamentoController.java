package br.com.Controller;

import br.com.Constant.Constant;
import br.com.Model.Modulo;
import br.com.Model.Orcamento;
import br.com.service.ModuloService;
import br.com.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class OrcamentoController {


    @Autowired
    private OrcamentoService orcamentoService;

    @Autowired
    private ModuloService moduloService; // Instancia a classe ModuloService

    @PostMapping(Constant.API_ORCAMENTO)
    public void save(@RequestBody Orcamento orcamento){
        Optional<Modulo> modulo = moduloService.findById(orcamento.getModulo().get_id());
        orcamento.setModulo(modulo.get());
        orcamentoService.save(orcamento);
    }

    @GetMapping(Constant.API_ORCAMENTO)
    public List<Orcamento> findAll(){
        return orcamentoService.findAll();
    }

    @PutMapping(Constant.API_ORCAMENTO)
    public void update (@RequestBody Orcamento orcamento){
        Optional<Modulo> modulo = moduloService.findById(orcamento.getModulo().get_id());
        orcamento.setModulo(modulo.get());
        orcamentoService.save(orcamento);
    }

    @DeleteMapping(Constant.API_ORCAMENTO + "/{id}")
    public void delete(@PathVariable("id") String id){
        orcamentoService.delete(id);
    }

    @GetMapping(Constant.API_ORCAMENTO + "/{id}")
    public Optional<Orcamento> findById(@PathVariable("id") String id){
        return orcamentoService.findById(id);
    }
}
