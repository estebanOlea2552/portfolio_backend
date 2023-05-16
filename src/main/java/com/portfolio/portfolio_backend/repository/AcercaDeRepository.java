package com.portfolio.portfolio_backend.repository;

import com.portfolio.portfolio_backend.model.AcercaDe;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe, Integer>{
        
}
