package com.inventario.productos.controller;

import com.inventario.productos.model.Asignatura;
import com.inventario.productos.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;
    
    @PostMapping("/nuevo")
    
    public Asignatura newAsignatura(@RequestBody Asignatura newAsignatura){
        
        return this.asignaturaService.newAsignatura(newAsignatura);
    
    
    }

@GetMapping("/mostrar")    
    public Iterable<Asignatura> getAll()  {
        return asignaturaService.getAll(); 
    }
    @PostMapping("/modificar")
    public Asignatura updateAsignatura(@RequestBody Asignatura asignatura){
        return this.asignaturaService.modifyAsignatura(asignatura);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteAsignatura(@PathVariable(value="id") Long id){
        return this.asignaturaService.deleteAsignatura(id);
    }
}
