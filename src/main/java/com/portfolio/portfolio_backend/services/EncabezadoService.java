package com.portfolio.portfolio_backend.services;

import com.portfolio.portfolio_backend.model.Encabezado;
import com.portfolio.portfolio_backend.repository.EncabezadoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EncabezadoService {
    
   @Autowired
   EncabezadoRepository encabezadoRepository;
   
   public List<Encabezado> list(){
       return encabezadoRepository.findAll();
   }   
   public Optional<Encabezado> getOne(int id){
       return encabezadoRepository.findById(id);
   }   
   public Optional<Encabezado> getByNombre(String nombre){
       return encabezadoRepository.findByNombre(nombre);
   }   
   public void save(Encabezado encabezado){
       encabezadoRepository.save(encabezado);
   }  
   public void delete(int id){
       encabezadoRepository.deleteById(id);
   }   
   public boolean existsById(int id){
       return encabezadoRepository.existsById(id);
   }   
   public boolean existsByName(String nombre){
       return encabezadoRepository.existsByNombre(nombre);
   }
}
