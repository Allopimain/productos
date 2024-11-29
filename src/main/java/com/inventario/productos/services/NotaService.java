package com.inventario.productos.services;

import com.inventario.productos.model.Nota;


public interface NotaService {

Nota newNota (Nota newNota);
Iterable<Nota> getAll();
Nota modifyNota (Nota Nota);
Boolean deleteNota (Long id);
        }

    