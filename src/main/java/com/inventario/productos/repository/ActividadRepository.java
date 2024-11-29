package com.inventario.productos.repository;

import com.inventario.productos.model.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadRepository extends JpaRepository<Actividad, Long>  {
    
}