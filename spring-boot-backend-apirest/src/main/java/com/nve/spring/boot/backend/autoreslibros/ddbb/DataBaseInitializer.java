package com.nve.spring.boot.backend.autoreslibros.ddbb;

import com.nve.spring.boot.backend.autoreslibros.model.Autor;
import com.nve.spring.boot.backend.autoreslibros.model.Libros;
import com.nve.spring.boot.backend.autoreslibros.model.repository.AutorRepository;
import com.nve.spring.boot.backend.autoreslibros.model.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class DataBaseInitializer {

    @Autowired
    AutorRepository autorRepository;

    @Autowired
    LibrosRepository    librosRepository;

    @PostConstruct
    public void init(){

        Libros b1 = new Libros("Biblia", "mejor lobro del mundo, palabra de Dios", "2019-05-09", 0);
        Libros b2 = new Libros("Guerrra", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b3 = new Libros ("Espiritual", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b4 = new Libros("Casa", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b5 = new Libros("Biologia", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b6 = new Libros("Programacion", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b7 = new Libros("Software", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b8 = new Libros("Psicologia", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b9 = new Libros("Quimica", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b10 = new Libros("Fisica", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b11 = new Libros("Java", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b12 = new Libros("Eucarestia", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b13 = new Libros("Profecia", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b14 = new Libros("Hogar", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b15 = new Libros("Familia", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);
        Libros b16 = new Libros("Matrimonio", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "2019-05-09", 0);

        librosRepository.save(b1);
        librosRepository.save(b2);
        librosRepository.save(b3);
        librosRepository.save(b4);
        librosRepository.save(b5);
        librosRepository.save(b6);
        librosRepository.save(b7);
        librosRepository.save(b8);
        librosRepository.save(b9);
        librosRepository.save(b10);
        librosRepository.save(b11);
        librosRepository.save(b12);
        librosRepository.save(b13);
        librosRepository.save(b14);
        librosRepository.save(b15);
        librosRepository.save(b16);




        Autor a1 = new Autor("Ernesto Baltasar", "Nve Obono", "eb.nve@alumnos.urjc.es", "615833334", " ", b1);
        Autor a10 = new Autor("Ernesto Baltasar", "Nve Obono", "eb.nve@alumnos.urjc.es", "615833334", " ", b2);
        Autor a2 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b3);
        Autor a3 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b4);
        Autor a4 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b5);
        Autor a5 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b6);
        Autor a6 = new Autor("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b7);
        Autor a7 = new Autor("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b8);
        Autor a8 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b9);
        Autor a9 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b10);
        Autor a11 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b11);
        Autor a12 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b12);
        Autor a13 = new Autor("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b13);
        Autor a14 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b14);
        Autor a15 = new Autor ("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b15);
        Autor a16 = new Autor("Ernesto Baltasar", "Nve Obono","eb.nve@alumnos.urjc.es", "615833334", " ", b16);

        autorRepository.save(a1);
        autorRepository.save(a2);
        autorRepository.save(a3);
        autorRepository.save(a4);
        autorRepository.save(a5);
        autorRepository.save(a6);
        autorRepository.save(a7);
        autorRepository.save(a8);
        autorRepository.save(a9);
        autorRepository.save(a10);
        autorRepository.save(a11);
        autorRepository.save(a12);
        autorRepository.save(a13);
        autorRepository.save(a14);
        autorRepository.save(a15);
        autorRepository.save(a16);




    }
}
