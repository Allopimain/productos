package com.inventario.productos.services;

import com.inventario.productos.model.Estudiantes;


public interface EstudiantesService {

Estudiantes newEstudiantes (Estudiantes newEstudiantes);
Iterable<Estudiantes> getAll();
Estudiantes modifyEstudiantes (Estudiantes Estudiantes);
Boolean deleteEstudiantes (Long id);
        }

    
