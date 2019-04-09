package com.nve.spring.boot.backend.autoreslibros.model.services;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import com.nve.spring.boot.backend.autoreslibros.model.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceAutor {

    @Autowired
    AutorRepository repository;


    public List<Autor> findAll() {
        return (List<Autor>)repository.findAll();
    }

    public Autor findById(long id){
        return repository.findById(id);
    }
}
