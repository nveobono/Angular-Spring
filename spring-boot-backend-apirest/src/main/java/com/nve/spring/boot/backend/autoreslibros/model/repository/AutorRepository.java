package com.nve.spring.boot.backend.autoreslibros.model.repository;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findAll();
    Autor findById(long id);
}
