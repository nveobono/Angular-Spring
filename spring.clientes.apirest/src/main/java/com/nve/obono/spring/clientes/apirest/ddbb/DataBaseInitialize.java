package com.nve.obono.spring.clientes.apirest.ddbb;

import com.nve.obono.spring.clientes.apirest.Repository.RepositoryCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class DataBaseInitialize {

    @Autowired
    RepositoryCliente repositoryCliente;

    @PostConstruct
    public void init(){
        Date date = new Date();

        Cliente c1 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c1);

        Cliente c2 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c2);

        Cliente c3 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c3);

        Cliente c4 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c4);

        Cliente c5 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c5);

        Cliente c6 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c6);

        Cliente c7 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c7);

        Cliente c8 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c8);

        Cliente c9 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c9);

        Cliente c10 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c10);

        Cliente c11 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c11);

        Cliente c12 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c12);

        Cliente c13 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c13);

        Cliente c14 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c14);

        Cliente c15 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c15);

        Cliente c16 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c16);

    }

}
