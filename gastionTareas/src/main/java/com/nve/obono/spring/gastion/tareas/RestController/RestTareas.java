package com.nve.obono.spring.gastion.tareas.RestController;


import com.nve.obono.spring.gastion.tareas.model.Tareas;
import com.nve.obono.spring.gastion.tareas.service.ServiceTareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestTareas {

    @Autowired
    ServiceTareas serviceTareas;

    @GetMapping("/tareas")
    public List<Tareas> index(){
        return serviceTareas.findAll();
    }

    @GetMapping("/tareas/{id}")
    public Tareas getTareasId(@PathVariable Long id){
        return serviceTareas.findById(id);
    }

    @DeleteMapping("/tareas/{id}")
    public void delete(@PathVariable Long id){
        Tareas tareas = serviceTareas.findById(id);
        serviceTareas.delete(tareas);
    }

    @PutMapping("tareas/{id}")
    public Tareas update(@PathVariable Long id, Tareas tareas){
        Tareas tareasActual = serviceTareas.findById(id);
        tareasActual.setTitulo(tareas.getTitulo());
        tareasActual.setTitulo(tareas.getDescripcion());
        tareasActual.setTerminado(tareas.isTerminado());
        return serviceTareas.create(tareas);
    }

    @PostMapping("/tareas")
    public Tareas create(Tareas tareas){
        return serviceTareas.create(tareas);
    }
}
