package br.unesp.rc.Repository;

import br.unesp.rc.Entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    Projeto findById(int idprojeto);

}