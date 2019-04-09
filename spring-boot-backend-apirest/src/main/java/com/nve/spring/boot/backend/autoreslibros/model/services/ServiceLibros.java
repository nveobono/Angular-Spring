package com.nve.spring.boot.backend.autoreslibros.model.services;

import com.nve.spring.boot.backend.autoreslibros.model.Libros;
import com.nve.spring.boot.backend.autoreslibros.model.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLibros {

    @Autowired
    LibrosRepository repository;

    public List<Libros> findAll(){
        return repository.findAll();
    }
}
