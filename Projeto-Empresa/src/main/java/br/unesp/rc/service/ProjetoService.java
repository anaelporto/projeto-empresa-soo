package br.unesp.rc.service;

import br.unesp.rc.Entity.Projeto;
import br.unesp.rc.Repository.ProjetoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    public ProjetoService() {
        
    }

    public Projeto save(Projeto entity) {
        Projeto persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    
    public Projeto update(Projeto entity) {

        Projeto persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    
    public void delete(Projeto entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Projeto findById(int Id) {
        Projeto insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    public List<Projeto> findAll() {
        List<Projeto> list = null;

        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
        }

        return list;
    }

}