package com.nve.spring.boot.backend.autoreslibros.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="autor_libros")
public class Autor {

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
    private ArrayList<Libros> libros;

    public Autor() {

    }

    public Autor(Long id, String nombreAutor, String apellidoAutor, String emailAutor, String telefonoAutor, String foto, ArrayList<Libros> libros) {
        this.id = id;
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

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

}
