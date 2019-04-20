package com.nve.obono.spring.gastion.tareas.model;

import javax.persistence.*;

@Entity
@Table(name = "tareasUsuario")
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column()
    private String descripcion;


    private boolean terminado;

    public Tareas(){}

    public Tareas(String titulo, String descripcion, boolean terminado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.terminado = terminado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
