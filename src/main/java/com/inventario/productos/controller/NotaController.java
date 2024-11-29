
package com.inventario.productos.controller;

import com.inventario.productos.model.Nota;
import com.inventario.productos.services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Nota")
public class NotaController {

    @Autowired
    private NotaService notaService;
    
    @PostMapping("/nuevo")
    
    public Nota newNota(@RequestBody Nota newNota){
        
        return this.notaService.newNota(newNota);
    
    
    }

@GetMapping("/mostrar")    
    public Iterable<Nota> getAll()  {
        return notaService.getAll(); 
    }
    @PostMapping("/modificar")
    public Nota updateNota(@RequestBody Nota nota){
        
        return this.notaService.modifyNota(nota);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteNota(@PathVariable(value="id") Long id){
        return this.notaService.deleteNota(id);
    }
}
