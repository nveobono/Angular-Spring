package com.nve.obono.spring.gastion.tareas.service;

import com.nve.obono.spring.gastion.tareas.model.Tareas;

import java.util.List;
import java.util.Optional;

public interface RepositoryImp {

    public Tareas create(Tareas tareas);

    public void delete(Tareas tareas);

    public List<Tareas> findAll();

    public Tareas findById(Long id);
}
