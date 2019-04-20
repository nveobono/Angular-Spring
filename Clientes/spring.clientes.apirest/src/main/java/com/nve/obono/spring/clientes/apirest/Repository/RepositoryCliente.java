package com.nve.obono.spring.clientes.apirest.Repository;

import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryCliente extends JpaRepository<Cliente, Long> {

}
