package com.nve.spring.boot.backend.autoreslibros.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "libros_del_autor")
public class Libros implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;

    @NotNull
    @Size(max = 250)
    private String descripcion;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;


    private double precio;

    public Libros() {

    }

    public Libros(int id, String nombre, String descripcion, Date fechaPublicación, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.createAt = fechaPublicación;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaPublicación() {
        return createAt;
    }

    public void setFechaPublicación(Date fechaPublicación) {
        this.createAt = fechaPublicación;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
