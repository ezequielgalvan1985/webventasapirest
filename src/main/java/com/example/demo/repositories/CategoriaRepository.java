package com.example.demo.repositories;

import java.util.List;

import com.example.demo.model.CategoriaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface CategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
    
    List<CategoriaModel> findByNombre(@Param("nombre") String nombre);
    
    
}
