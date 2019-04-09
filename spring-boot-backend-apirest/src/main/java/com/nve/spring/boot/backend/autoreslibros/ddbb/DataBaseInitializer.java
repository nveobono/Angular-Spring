package com.nve.spring.boot.backend.autoreslibros.ddbb;

import com.nve.spring.boot.backend.autoreslibros.model.repository.AutorRepository;
import com.nve.spring.boot.backend.autoreslibros.model.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DataBaseInitializer {

    @Autowired
    AutorRepository autorRepository;

    @Autowired
    LibrosRepository    librosRepository;
}
