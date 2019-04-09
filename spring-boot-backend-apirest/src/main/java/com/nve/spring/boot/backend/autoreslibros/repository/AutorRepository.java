package com.nve.spring.boot.backend.autoreslibros.repository;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
