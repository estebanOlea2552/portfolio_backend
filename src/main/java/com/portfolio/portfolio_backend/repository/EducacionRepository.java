package com.portfolio.portfolio_backend.repository;

import com.portfolio.portfolio_backend.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    
    public Optional<Educacion> findByEscuela(String escuela);    
    public boolean existsByEscuela(String escuela);
    
}
