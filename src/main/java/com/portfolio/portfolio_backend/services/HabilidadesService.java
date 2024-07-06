package com.portfolio.portfolio_backend.services;

import com.portfolio.portfolio_backend.model.Habilidades;
import com.portfolio.portfolio_backend.repository.HabilidadesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService {

    @Autowired
    HabilidadesRepository habilidadesRepository;

    public List<Habilidades> list() {
        return habilidadesRepository.findAll();
    }

    public Optional<Habilidades> getOne(int id) {
        return habilidadesRepository.findById(id);
    }

    public Optional<Habilidades> getByNombre(String nombre) {
        return habilidadesRepository.findByNombre(nombre);
    }

    public void save(Habilidades habilidades) {
        habilidadesRepository.save(habilidades);
    }

    public void delete(int id) {
        habilidadesRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return habilidadesRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return habilidadesRepository.existsByNombre(nombre);
    }
}
