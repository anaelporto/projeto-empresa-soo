package br.unesp.rc.Repository;

import br.unesp.rc.Entity.Juridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuridicaRepository extends JpaRepository<Juridica, Long> {

    Juridica findByCnpj(String cnpj);
    Juridica findByEmail(String email);
}