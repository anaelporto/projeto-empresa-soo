package br.unesp.rc.resource;

import br.unesp.rc.DTO.FisicaDTO;
import br.unesp.rc.DTO.assember.FisicaAssember;
import br.unesp.rc.Entity.Fisica;
import br.unesp.rc.service.FisicaService;
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
public class FisicaResource {
    
    @Autowired
    private FisicaService fisicaService;
    
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
     @GetMapping("/cadastro")
    public String showRegistrationForm() {
        return "CadastroPessoa";
    }
    
    @GetMapping("/")
    public List<Fisica> getAllFisica() {

        return fisicaService.findAll();
    }
    
    @GetMapping("/{cpf}")
    public Fisica getFisicaByCpf(@PathVariable(value = "cpf") String cpf) {
        Fisica fisica = fisicaService.findByCpf(cpf);

        return fisica;
    }
    
    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Fisica fisicaDelete = fisicaService.findByCpf(cpf);

        if (fisicaDelete != null){
         fisicaService.delete(fisicaDelete);
         delete = true;
        }        

        return delete;
    }
  
    @PostMapping("/")
    public boolean saveFisica(@RequestBody FisicaDTO fisicaDto) {
        boolean insert = false;

        Fisica fisica = FisicaAssember.dtoToEntityModel(fisicaDto);
        Fisica fisicaInsert = fisicaService.save(fisica);
        if (fisicaInsert != null){
            insert = true;
        }

        return insert;
    }
    
    @PutMapping("/{cpf}")
    public boolean updateFisica(@PathVariable(value = "cpf") String cpf,
            @RequestBody FisicaDTO fisicaDto) {
        boolean update = false;
        
        Fisica fisicaUpdate = fisicaService.findByCpf(cpf);        
        Fisica newFisica = FisicaAssember.dtoToEntityModel(fisicaDto);
        
        fisicaUpdate.setNome(newFisica.getNome());
        fisicaUpdate.getContato().setCelular(newFisica.getContato().getCelular());
        fisicaUpdate.getContato().setEmail(newFisica.getContato().getEmail());

        Fisica fisicaUpdated = fisicaService.update(fisicaUpdate);
        if (fisicaUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
