package br.unesp.rc.service;

import br.unesp.rc.Entity.Juridica;
import br.unesp.rc.Repository.JuridicaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JuridicaService {

    @Autowired
    private JuridicaRepository repository;

    public JuridicaService() {
        
    }

    public Juridica save(Juridica entity) {
        Juridica persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    
    public Juridica update(Juridica entity) {

        Juridica persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    
    public void delete(Juridica entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Juridica findByCnpj(String cpf) {
        Juridica insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCnpj(cpf);
        }

        return insertedEntity;
    }

    public List<Juridica> findAll() {
        List<Juridica> list = null;

        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
        }

        return list;
    }

}