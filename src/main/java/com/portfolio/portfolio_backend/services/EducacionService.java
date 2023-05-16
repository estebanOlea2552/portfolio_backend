package com.portfolio.portfolio_backend.services;

import com.portfolio.portfolio_backend.model.Educacion;
import com.portfolio.portfolio_backend.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    
    @Autowired
    EducacionRepository educacionRepository;
    
    public List<Educacion> list(){
       return educacionRepository.findAll();
    }
    public Optional<Educacion> getOne(int id){
       return educacionRepository.findById(id);
    }
    public Optional<Educacion> getByEscuela(String escuela){
       return educacionRepository.findByEscuela(escuela);
    }
    public void save(Educacion educacion){
       educacionRepository.save(educacion);
    }
    public void delete(int id){
       educacionRepository.deleteById(id);
    }
    public boolean existsById(int id){
       return educacionRepository.existsById(id);
    }
    public boolean existsByEscuela(String escuela){
       return educacionRepository.existsByEscuela(escuela);
    }
}
