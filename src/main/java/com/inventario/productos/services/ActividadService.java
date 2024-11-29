package com.inventario.productos.services;

import com.inventario.productos.model.Actividad;


public interface ActividadService {

Actividad newActividad (Actividad newActividad);
Iterable<Actividad> getAll();
Actividad modifyActividad (Actividad Actividad);
Boolean deleteActividad (Long id);
        }

    