
package com.inventario.productos.controller;

import com.inventario.productos.model.Estudiantes;
import com.inventario.productos.services.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService estudiantesService;
    
    @PostMapping("/nuevo")
    
    public Estudiantes newEstudiantes(@RequestBody Estudiantes newEstudiantes){
        
        return this.estudiantesService.newEstudiantes(newEstudiantes);
    
    
    }

@GetMapping("/mostrar")    
    public Iterable<Estudiantes> getAll()  {
        return estudiantesService.getAll(); 
    }
    @PostMapping("/modificar")
    public Estudiantes updateEstudiantes(@RequestBody Estudiantes estudiantes){
        
        return this.estudiantesService.modifyEstudiantes(estudiantes);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteEstudiantes(@PathVariable(value="id") Long id){
        return this.estudiantesService.deleteEstudiantes(id);
    }
}
