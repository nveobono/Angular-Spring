package com.nve.obono.spring.clientes.apirest.Service;

import com.nve.obono.spring.clientes.apirest.model.Cliente;

import java.util.List;

public interface ServiceImplement {
    public List<Cliente> findAll();

    public Cliente addCliente(Cliente cliente);

    public void deleteCliente(Cliente cliente);

    public Cliente findById(Long id);
}
