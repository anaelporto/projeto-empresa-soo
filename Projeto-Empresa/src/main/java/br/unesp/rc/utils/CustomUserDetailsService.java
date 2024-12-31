package br.unesp.rc.utils;
 
import br.unesp.rc.Entity.Fisica;
import br.unesp.rc.Entity.Juridica;
import br.unesp.rc.Repository.FisicaRepository;
import br.unesp.rc.Repository.JuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
 
public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private FisicaRepository fisicaRepo;
    private JuridicaRepository juridicaRepo;
     
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Fisica fisica = fisicaRepo.findByEmail(username);
        Juridica juridica = juridicaRepo.findByEmail(username);
        if (fisica == null) {
            if(juridica == null){
                throw new UsernameNotFoundException("User not found");
            }
        }
        
        return new CustomUserDetails(fisica);
    }
 
}