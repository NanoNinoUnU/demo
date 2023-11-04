/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicios;

import com.example.demo.Repositorios.RepositorioAnimal;
import com.example.demo.Entidades.Animal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author double
 */
public class ServicioAnimal {

    //inyectar el repositorio en el servicio
    //inyección de dependencias
    @Autowired
    RepositorioAnimal rAnimal;

    public List<Animal> obtenerTodosLosAnimales() {
        return rAnimal.findAll();
    }

    public boolean insertarAnimal(Animal a) {
        boolean respuesta = false;
        try {
            rAnimal.save(a);//insert o update a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
    public boolean actualizarAnimal(Animal a) {
        boolean respuesta = false;
        try {
            rAnimal.save(a);//insert o update a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
    public boolean eliminarAnimal(Animal a) {
        boolean respuesta = false;
        try {
            rAnimal.delete(a);//delete a nicel de bd
            respuesta=true;
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

}
