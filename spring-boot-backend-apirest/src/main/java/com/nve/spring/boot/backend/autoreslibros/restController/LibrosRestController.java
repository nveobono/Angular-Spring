package com.nve.spring.boot.backend.autoreslibros.restController;

import com.nve.spring.boot.backend.autoreslibros.model.Libros;
import com.nve.spring.boot.backend.autoreslibros.model.services.ServiceLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibrosRestController {

    @Autowired
    private ServiceLibros serviceLibros;

    @GetMapping("/")
    public List<Libros> indexLibros(){
        return serviceLibros.findAll();
    }
}
