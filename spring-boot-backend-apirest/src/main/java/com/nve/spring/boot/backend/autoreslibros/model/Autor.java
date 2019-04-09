package com.nve.spring.boot.backend.autoreslibros.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name="autor_libros")
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreAutor;
    private String apellidoAutor;
    private String emailAutor;
    private String telefonoAutor;
    private String foto;

    @Column()
    @ManyToMany
    private Libros libros;

    public Autor() {

    }

    public Autor(String nombreAutor, String apellidoAutor, String emailAutor, String telefonoAutor, String foto, Libros libros) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.emailAutor = emailAutor;
        this.telefonoAutor = telefonoAutor;
        this.foto = foto;
        this.libros = libros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getEmailAutor() {
        return emailAutor;
    }

    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }

    public String getTelefonoAutor() {
        return telefonoAutor;
    }

    public void setTelefonoAutor(String telefonoAutor) {
        this.telefonoAutor = telefonoAutor;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

}
