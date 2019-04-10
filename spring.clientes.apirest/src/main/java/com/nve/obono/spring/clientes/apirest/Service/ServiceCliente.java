package com.nve.obono.spring.clientes.apirest.Service;

import com.nve.obono.spring.clientes.apirest.Repository.RepositoryCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCliente {

    @Autowired
    RepositoryCliente repositoryCliente;

    public List<Cliente> findAll(){
        return repositoryCliente.findAll();
    }
}
