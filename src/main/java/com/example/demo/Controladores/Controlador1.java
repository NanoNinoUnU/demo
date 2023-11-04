package com.example.demo.Controladores;

import com.example.demo.Servicios.ServicioAnimal;
import com.example.demo.Entidades.Animal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class Controlador1 {
    @Autowired
    ServicioAnimal sAnimal;
    
    @GetMapping("")//no es un edpoint si no le agregas esto
    public List<Animal> getTodosLosAnimales(){
        System.out.println("hola :D");
        return sAnimal.obtenerTodosLosAnimales();
        
    }
    @PostMapping("")
    public List<Animal> postInsertarAnimal(@RequestBody Animal a1){
        if(sAnimal.insertarAnimal(a1)){
            return sAnimal.obtenerTodosLosAnimales();
        }else{
            return null;
        }
    }
    @PutMapping("")
    public List<Animal> putActualizarAnimal(@RequestBody Animal a1){
        if(sAnimal.actualizarAnimal(a1)){
            return sAnimal.obtenerTodosLosAnimales();
        }else{
            return null;
        }
    }
    @DeleteMapping("")
    public List<Animal> deleteAnimal(@RequestBody Animal a1){
        if(sAnimal.eliminarAnimal(a1)){
            return sAnimal.obtenerTodosLosAnimales();
        }else{
            return null;
        }
    }
}
