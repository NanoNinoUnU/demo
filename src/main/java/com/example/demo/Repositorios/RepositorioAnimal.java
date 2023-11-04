package com.example.demo.Repositorios;

import com.example.demo.Entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAnimal extends JpaRepository<Animal, Integer> {
    //Todos los metodos que ejecutaran consultas a la BD
    
}
