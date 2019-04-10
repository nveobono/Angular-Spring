package com.nve.obono.spring.clientes.apirest.RestController;

import com.nve.obono.spring.clientes.apirest.Service.ServiceCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestCliente {

    @Autowired
    private ServiceCliente serviceCliente;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return serviceCliente.findAll();
    }
}
