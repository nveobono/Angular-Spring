package com.nve.spring.boot.backend.autoreslibros.restController;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import com.nve.spring.boot.backend.autoreslibros.model.services.ServiceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorRestController {

    @Autowired
    private ServiceAutor serviceAutor;

    @GetMapping("/")
    public List<Autor> indexAutor(){
        return serviceAutor.findAll();
    }
}
