package com.nve.obono.spring.gastion.tareas.service;

import com.nve.obono.spring.gastion.tareas.model.Tareas;
import com.nve.obono.spring.gastion.tareas.repository.RepositoryTareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTareas implements RepositoryImp {

    @Autowired
    RepositoryTareas repositoryTareas;

    @Override
    public Tareas create(Tareas tareas) {
        return repositoryTareas.save(tareas);
    }

    @Override
    public void delete(Tareas tareas) {
        repositoryTareas.delete(tareas);
    }

    @Override
    public List<Tareas> findAll() {
        return repositoryTareas.findAll();
    }

    @Override
    public Tareas findById(Long id) {
        return repositoryTareas.findById(id).orElse(null);
    }
}
