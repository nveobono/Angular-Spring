package com.nve.obono.spring.clientes.apirest.Service;

import com.nve.obono.spring.clientes.apirest.Repository.RepositoryCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCliente implements ServiceImplement{

    @Autowired
    RepositoryCliente repositoryCliente;

    public List<Cliente> findAll(){
        return repositoryCliente.findAll();
    }

    public Cliente findById(Long id) {
        return repositoryCliente.findById(id).orElse(null);
    }

    public Cliente addCliente(Cliente cliente){
        return repositoryCliente.save(cliente);
    }

    public void deleteCliente(Long id){
        repositoryCliente.deleteById(id);
    }
}
