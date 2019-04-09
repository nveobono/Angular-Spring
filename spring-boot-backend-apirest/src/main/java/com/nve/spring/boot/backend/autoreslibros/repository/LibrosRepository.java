package com.nve.spring.boot.backend.autoreslibros.repository;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import com.nve.spring.boot.backend.autoreslibros.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibrosRepository extends JpaRepository<Libros, Long> {

    public List<Autor> findAll();

}

