package com.inventario.productos.services;

import com.inventario.productos.model.Asignatura;


public interface AsignaturaService {

Asignatura newAsignatura (Asignatura newAsignatura);
Iterable<Asignatura> getAll();
Asignatura modifyAsignatura(Asignatura Asignatura);
Boolean deleteAsignatura (Long id);
}