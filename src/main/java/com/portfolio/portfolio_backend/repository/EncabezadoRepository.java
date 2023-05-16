package com.portfolio.portfolio_backend.repository;

import com.portfolio.portfolio_backend.model.Encabezado;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncabezadoRepository extends JpaRepository<Encabezado, Integer>{
    
    public Optional<Encabezado> findByNombre(String nombre);    
    public boolean existsByNombre(String nombre);
        
}
