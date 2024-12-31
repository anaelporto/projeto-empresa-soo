package br.unesp.rc.resource;

import br.unesp.rc.Entity.Pessoa;
import br.unesp.rc.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class AppController {
 
    @Autowired
    private ProjetoRepository projeto;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Pessoa pessoa) {

        return "CadastroPessoa";
    }
}