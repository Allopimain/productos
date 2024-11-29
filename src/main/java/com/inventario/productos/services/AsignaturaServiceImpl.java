package com.inventario.productos.services;

import com.inventario.productos.model.Asignatura;
import com.inventario.productos.repository.AsignaturaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;
    @Override
    public Asignatura newAsignatura(Asignatura newAsignatura) {
      return asignaturaRepository.save(newAsignatura);
        
    }

    @Override
    public Iterable<Asignatura> getAll() {
        return this.asignaturaRepository.findAll();
    }

    @Override
    public Asignatura modifyAsignatura(Asignatura Asignatura) {
       
        Optional<Asignatura> asignaturaEncontrado= this.asignaturaRepository.findById(Asignatura.getId());
       if(asignaturaEncontrado.get()!=null){
           asignaturaEncontrado.get().setNombre(Asignatura.getNombre());
            asignaturaEncontrado.get().setCreditos(Asignatura.getCreditos());
           asignaturaEncontrado.get().setProfesor(Asignatura.getProfesor());
           return this.newAsignatura(asignaturaEncontrado.get());
           
       }
        
        
        return null;
        
        
    }

    @Override
    public Boolean deleteAsignatura(Long id) {
    this.asignaturaRepository.deleteById(id);
    
    return true;
       
    }
    
    
    
}
