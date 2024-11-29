package com.inventario.productos.services;

import com.inventario.productos.model.Actividad;
import com.inventario.productos.repository.ActividadRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActividadServiceImpl implements ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;
    @Override
    public Actividad newActividad(Actividad newActividad) {
      return actividadRepository.save(newActividad);
        
    }

    @Override
    public Iterable<Actividad> getAll() {
        return this.actividadRepository.findAll();
    }

    @Override
    public Actividad modifyActividad(Actividad Actividad) {
       
        Optional<Actividad> actividadEncontrado= this.actividadRepository.findById(Actividad.getId());
       if(actividadEncontrado.get()!=null){
           actividadEncontrado.get().setNombre(Actividad.getNombre());
           actividadEncontrado.get().setCreditos(Actividad.getCreditos());
           actividadEncontrado.get().setProfesor(Actividad.getProfesor());
           return this.newActividad(actividadEncontrado.get());
           
       }
        
        
        return null;
        
        
    }

    @Override
    public Boolean deleteActividad(Long id) {
    this.actividadRepository.deleteById(id);
    return true;
       
    }
    
    
    
}