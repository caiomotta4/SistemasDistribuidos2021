package br.com.Controller;

import br.com.Constant.Constant;
import br.com.Model.Squad;
import br.com.Model.Modulo;
import br.com.Model.Ambiente;
import br.com.service.SquadService;
import br.com.service.ModuloService;
import br.com.service.AmbienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @Autowired
    private SquadService squadService;  // Instancia a classe ClienteService

    @Autowired
    private AmbienteService ambienteService;  // Instancia a classe ProdutoService

    @PostMapping(Constant.API_MODULO)
    public void save(@RequestBody Modulo modulo){
        Optional<Squad> squad = squadService.findById(modulo.getSquad().get_id());    // Objeto cliente recebe o ID do cliente vindo do JSON do swagger
        modulo.setSquad(squad.get());                                                    // Atributo cliente do Objeto OS recebe o objeto cliente         // É feito o INSERT do OS com o objeto cliente

        Optional<Ambiente> ambiente = ambienteService.findById(modulo.getAmbiente().get_id());
        modulo.setAmbiente(ambiente.get());
        moduloService.save(modulo);
    }

    @GetMapping(Constant.API_MODULO)
    public List<Modulo> findAll(){
        return moduloService.findAll();
    }

    @PutMapping(Constant.API_MODULO)
    public void update (@RequestBody Modulo modulo){
        Optional<Squad> squad = squadService.findById(modulo.getSquad().get_id());
        modulo.setSquad(squad.get());

        Optional<Ambiente> ambiente = ambienteService.findById(modulo.getAmbiente().get_id());
        modulo.setAmbiente(ambiente.get());
        moduloService.save(modulo);
    }

    @DeleteMapping(Constant.API_MODULO + "/{id}")
    public void delete(@PathVariable("id") String id){
        moduloService.delete(id);
    }

    @GetMapping(Constant.API_MODULO + "/{id}")
    public Optional<Modulo> findById(@PathVariable("id") String id){
        return moduloService.findById(id);
    }


    /*
    @Autowired
    private OrdemServicoService ordemServicoService;

    @PostMapping(Constant.API_OS)
    public void save(@RequestBody OrdemServico cliente){
        ordemServicoService.save(cliente);
    }

    @GetMapping(Constant.API_OS)
    public List<OrdemServico> findAll(){
        return ordemServicoService.findAll();
    }

    @PutMapping(Constant.API_OS)
    public void update (@RequestBody OrdemServico ordemServico){
        ordemServicoService.save(ordemServico);
    }

    @DeleteMapping(Constant.API_OS + "/{id}")
    public void delete(@PathVariable("id") String id){
        ordemServicoService.delete(id);
    }

    @GetMapping(Constant.API_OS + "/{id}")
    public Optional<OrdemServico> findById(@PathVariable("id") String id){
        return ordemServicoService.findById(id);
    }*/
}
