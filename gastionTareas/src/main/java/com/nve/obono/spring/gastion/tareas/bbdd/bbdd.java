package com.nve.obono.spring.gastion.tareas.bbdd;

import com.nve.obono.spring.gastion.tareas.model.Tareas;
import com.nve.obono.spring.gastion.tareas.repository.RepositoryTareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class bbdd {

    @Autowired
    RepositoryTareas repositoryTareas;

    @PostConstruct
    public void init(){
        Tareas t1 = new Tareas("Programación", "Estare prongramando una aplicacion en Java usando el framework de angulas y Spring MVC", true);
        repositoryTareas.save(t1);

        Tareas t2 = new Tareas("Miras redes sociales", "Pasar poco tiempo en las redes sociales", false);
        repositoryTareas.save(t2);

        Tareas t3 = new Tareas("Ir a clase", "Ateder las clases de hoy de DAW y Seguridad informatica", true);
        repositoryTareas.save(t3);

        Tareas t4 = new Tareas("Llamar hermanos", "Tener que llamar a los hermanos de la iglesia", true);
        repositoryTareas.save(t4);

        Tareas t5 = new Tareas("Leer libro", "Continuar leyendo libro", false);
        repositoryTareas.save(t5);

        Tareas t6 = new Tareas("Atender Culto", "", true);
        repositoryTareas.save(t6);

        Tareas t7 = new Tareas("Predicación", "", false);
        repositoryTareas.save(t7);

        Tareas t8 = new Tareas("Estar con la familia", "Pasar tiempo con mis padres y hermanos antes de ir a la cama", true);
        repositoryTareas.save(t8);
    }
}
