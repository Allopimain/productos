package com.inventario.productos.repository;

import com.inventario.productos.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long>  {
    
}