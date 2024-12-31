package br.unesp.rc.resource;

import br.unesp.rc.DTO.ProjetoDTO;
import br.unesp.rc.DTO.assember.ProjetoAssember;
import br.unesp.rc.Entity.Projeto;
import br.unesp.rc.service.ProjetoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProjetoResource {
    
    @Autowired
    private ProjetoService projetoService;
    
    @GetMapping("/")
    public List<Projeto> getAllProjeto() {

        return projetoService.findAll();
    }
    
    @GetMapping("/cadastro/pedido")
    public String showRegistrationForm() {
        return "CadastroPessoa";
    }
    
    @GetMapping("/{Id}")
    public Projeto getProjetoById(@PathVariable(value = "Id") int Id) {
        Projeto projeto = projetoService.findById(Id);

        return projeto;
    }
    
    @DeleteMapping("/{Id}")
    public boolean delete(@PathVariable(value = "id") int id) {
        boolean delete = false;
        Projeto projetoDelete = projetoService.findById(id);

        if (projetoDelete != null){
            projetoService.delete(projetoDelete);
            delete = true;
        }        

        return delete;
    }
  
    @PostMapping("/")
    public boolean saveProjeto(@RequestBody ProjetoDTO projetoDto) {
        boolean insert = false;

        Projeto projeto = ProjetoAssember.dtoToEntityModel(projetoDto);
        Projeto projetoInsert = projetoService.save(projeto);
        if (projetoInsert != null){
            insert = true;
        }

        return insert;
    }
    
    @PutMapping("/{Id}")
    public boolean updateProjeto(@PathVariable(value = "Id") int Id,
            @RequestBody ProjetoDTO projetoDto) {
        boolean update = false;
        
        Projeto projetoUpdate = projetoService.findById(Id);        
        Projeto newProjeto = ProjetoAssember.dtoToEntityModel(projetoDto);
        
        projetoUpdate.setDescricao(newProjeto.getDescricao());
        projetoUpdate.setProgresso(newProjeto.getProgresso());
        projetoUpdate.setDataFim(newProjeto.getDataFim());

        Projeto projetoUpdated = projetoService.update(projetoUpdate);
        if (projetoUpdated != null){
            update = true;
        }

        return update;
    }
}