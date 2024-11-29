
package com.inventario.productos.controller;

import com.inventario.productos.model.Actividad;
import com.inventario.productos.services.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Actividad")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;
    
    @PostMapping("/nuevo")
    
    public Actividad newActividad(@RequestBody Actividad newActividad){
        
        return this.actividadService.newActividad(newActividad);
    
    
    }

@GetMapping("/mostrar")    
    public Iterable<Actividad> getAll()  {
        return actividadService.getAll(); 
    }
    @PostMapping("/modificar")
    public Actividad updateActividad(@RequestBody Actividad actividad){
        return this.actividadService.modifyActividad(actividad);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteActividad(@PathVariable(value="id") Long id){
        return this.actividadService.deleteActividad(id);
    }
}
