package com.nve.spring.boot.backend.autoreslibros.model.repository;


import com.nve.spring.boot.backend.autoreslibros.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibrosRepository extends JpaRepository<Libros, Long> {

    List<Libros> findAll();
    Libros findById(long id);

}

