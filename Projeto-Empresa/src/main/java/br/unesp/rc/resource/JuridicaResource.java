package br.unesp.rc.resource;

import br.unesp.rc.DTO.JuridicaDTO;
import br.unesp.rc.DTO.assember.JuridicaAssember;
import br.unesp.rc.Entity.Juridica;
import br.unesp.rc.service.JuridicaService;
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
public class JuridicaResource {
    
    @Autowired
    private JuridicaService juridicaService;
    
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/")
    public List<Juridica> getAllJuridica() {

        return juridicaService.findAll();
    }
    
    @GetMapping("/cadastro")
    public String showRegistrationForm() {
        return "CadastroPessoa";
    }
    
    @GetMapping("/{cnpj}")
    public Juridica getJuridicaByCnpj(@PathVariable(value = "cnpj") String cnpj) {
        Juridica juridica = juridicaService.findByCnpj(cnpj);

        return juridica;
    }
    
    @DeleteMapping("/{cnpj}")
    public boolean delete(@PathVariable(value = "cnpj") String cnpj) {
        boolean delete = false;
        Juridica juridicaDelete = juridicaService.findByCnpj(cnpj);

        if (juridicaDelete != null){
         juridicaService.delete(juridicaDelete);
         delete = true;
        }        

        return delete;
    }
  
    @PostMapping("/")
    public boolean saveJuridica(@RequestBody JuridicaDTO juridicaDto) {
        boolean insert = false;

        Juridica juridica = JuridicaAssember.dtoToEntityModel(juridicaDto);
        Juridica juridicaInsert = juridicaService.save(juridica);
        if (juridicaInsert != null){
            insert = true;
        }

        return insert;
    }
    
    @PutMapping("/{cnpj}")
    public boolean updateJuridica(@PathVariable(value = "cnpj") String cnpj,
            @RequestBody JuridicaDTO juridicaDto) {
        boolean update = false;
        
        Juridica juridicaUpdate = juridicaService.findByCnpj(cnpj);        
        Juridica newJuridica = JuridicaAssember.dtoToEntityModel(juridicaDto);
        
        juridicaUpdate.setNome(newJuridica.getNome());
        juridicaUpdate.getContato().setEmail(newJuridica.getContato().getEmail());
        juridicaUpdate.getContato().setTelefoneComercial(newJuridica.getContato().getTelefoneComercial());

        Juridica juridicaUpdated = juridicaService.update(juridicaUpdate);
        if (juridicaUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
