package com.inventario.productos.repository;

import com.inventario.productos.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long>  {
    
}
