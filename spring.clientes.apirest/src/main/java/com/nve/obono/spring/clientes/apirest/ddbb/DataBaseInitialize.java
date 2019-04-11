package com.nve.obono.spring.clientes.apirest.ddbb;

import com.nve.obono.spring.clientes.apirest.Repository.RepositoryCliente;
import com.nve.obono.spring.clientes.apirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Component
public class DataBaseInitialize {

    @Autowired
    RepositoryCliente repositoryCliente;

    @PostConstruct
    public void init(){
        Date date = new Date();

        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        Date randomBirthDate = new Date(randomDay);

        Cliente c1 = new Cliente("Ernesto", "Nve", "eb.nve@alumnos.urjc.es", randomBirthDate);
        repositoryCliente.save(c1);

        Cliente c2 = new Cliente("Leslie", "Vicente", "lv.ar@gmail.com", date);
        repositoryCliente.save(c2);

        Cliente c3 = new Cliente("Juam", "Manuel", "j.ma@alumnos.urjc.es", date);
        repositoryCliente.save(c3);

        Cliente c4 = new Cliente("Jesus", "Avila", "j.av@gmail.com", date);
        repositoryCliente.save(c4);

        Cliente c5 = new Cliente("Miguel", "Torrijos", "m.tor@alumnos.urjc.es", date);
        repositoryCliente.save(c5);

        Cliente c6 = new Cliente("Bryan", "Vicente", "b.vin@gmail.com", date);
        repositoryCliente.save(c6);

        Cliente c7 = new Cliente("Vicente", "Nve", "va.nve@alumnos.urjc.es", date);
        repositoryCliente.save(c7);

        Cliente c8 = new Cliente("Betty", "Nve", "b.obono@gmail.com", date);
        repositoryCliente.save(c8);

        Cliente c9 = new Cliente("Pedro", "Luis", "p.luis@alumnos.urjc.es", date);
        repositoryCliente.save(c9);

        Cliente c10 = new Cliente("Luis", "Sanchez", "l.sanchez@gmail.com", date);
        repositoryCliente.save(c10);

        Cliente c11 = new Cliente("Carlos", "Vacaz", "ca.vacaz@alumnos.urjc.es", date);
        repositoryCliente.save(c11);

        Cliente c12 = new Cliente("Jorge", "Gameiro", "jor.gar@gmail.com", date);
        repositoryCliente.save(c12);

        Cliente c13 = new Cliente("Ana", "Mba", "ana.mba@alumnos.urjc.es", date);
        repositoryCliente.save(c13);

        Cliente c14 = new Cliente("Kiela", "Nsue", "keila.nsue@gmail.com", date);
        repositoryCliente.save(c14);

        Cliente c15 = new Cliente("Chelina", "Edu", "chelina.edu@alumnos.urjc.es", date);
        repositoryCliente.save(c15);

        Cliente c16 = new Cliente("Antonio", "Maria", "antonio.maria@gmail.com", date);
        repositoryCliente.save(c16);

    }

}
