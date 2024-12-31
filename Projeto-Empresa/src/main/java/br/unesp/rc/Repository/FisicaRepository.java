package br.unesp.rc.Repository;

import br.unesp.rc.Entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FisicaRepository extends JpaRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);
    Fisica findByCargo(String cargo);
    Fisica findByEmail(String email);
}