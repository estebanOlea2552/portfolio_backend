package com.portfolio.portfolio_backend.services;

import com.portfolio.portfolio_backend.model.AcercaDe;
import com.portfolio.portfolio_backend.repository.AcercaDeRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcercaDeService {
    
    @Autowired
    AcercaDeRepository acercaDeRepository;
    
    public List<AcercaDe> list(){
       return acercaDeRepository.findAll();
    }    
    public Optional<AcercaDe> getOne(int id){
       return acercaDeRepository.findById(id);
    }    
    public void save(AcercaDe acercaDe){
       acercaDeRepository.save(acercaDe);
    }   
    public void delete(int id){
       acercaDeRepository.deleteById(id);
    }   
    public boolean existsById(int id){
       return acercaDeRepository.existsById(id);
    }    
}
