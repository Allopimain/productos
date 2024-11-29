package com.inventario.productos.services;

import com.inventario.productos.model.Estudiantes;
import com.inventario.productos.repository.EstudiantesRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudiantesServiceImpl implements EstudiantesService {

    @Autowired
    private EstudiantesRepository estudiantesRepository;
    @Override
    public Estudiantes newEstudiantes(Estudiantes newEstudiantes) {
      return estudiantesRepository.save(newEstudiantes);
        
    }

    @Override
    public Iterable<Estudiantes> getAll() {
        return this.estudiantesRepository.findAll();
    }

    @Override
    public Estudiantes modifyEstudiantes(Estudiantes Estudiantes) {
       
        Optional<Estudiantes> estudiantesEncontrado= this.estudiantesRepository.findById(Estudiantes.getId());
       if(estudiantesEncontrado.get()!=null){
           estudiantesEncontrado.get().setNombre(Estudiantes.getNombre());
           estudiantesEncontrado.get().setApellido(Estudiantes.getApellido());
           estudiantesEncontrado.get().setCorreo(Estudiantes.getCorreo());
           return this.newEstudiantes(estudiantesEncontrado.get());
           
       }
        
        
        return null;
        
        
    }

    @Override
    public Boolean deleteEstudiantes(Long id) {
    this.estudiantesRepository.deleteById(id);
    return true;
       
    }

}
