package com.inventario.productos.services;

import com.inventario.productos.model.Nota;
import com.inventario.productos.repository.NotaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepository;
    @Override
    public Nota newNota(Nota newNota) {
      return notaRepository.save(newNota);
        
    }

    @Override
    public Iterable<Nota> getAll() {
        return this.notaRepository.findAll();
    }

    @Override
    public Nota modifyNota(Nota Nota) {
       
        Optional<Nota> notaEncontrado= this.notaRepository.findById(Nota.getId());
       if(notaEncontrado.get()!=null){
           notaEncontrado.get().setActividad(Nota.getActividad());
           notaEncontrado.get().setValor(Nota.getValor());
           notaEncontrado.get().setEstudiante(Nota.getEstudiante());
           return this.newNota(notaEncontrado.get());
           
       }
        
        
        return null;
        
        
    }

    @Override
    public Boolean deleteNota(Long id) {
    this. notaRepository.deleteById(id);
        return null;
       
    }
    
    
    
}
