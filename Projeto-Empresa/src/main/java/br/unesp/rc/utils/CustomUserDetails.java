package br.unesp.rc.utils;

import br.unesp.rc.Entity.Pessoa;
import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
 
public class CustomUserDetails implements UserDetails {
 
    private Pessoa pessoa;
     
    public CustomUserDetails(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
 
    @Override
    public String getPassword() {
        return pessoa.getAcesso().getSenha();
    }
 
    @Override
    public String getUsername() {
        return pessoa.getAcesso().getLogin();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
     
    public String getName() {
        return pessoa.getNome();
    }
 
}
