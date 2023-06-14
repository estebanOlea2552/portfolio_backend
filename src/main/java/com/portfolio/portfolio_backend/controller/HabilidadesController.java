package com.portfolio.portfolio_backend.controller;

import com.portfolio.portfolio_backend.dto.HabilidadesDto;
import com.portfolio.portfolio_backend.model.Habilidades;
import com.portfolio.portfolio_backend.services.HabilidadesService;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
//@CrossOrigin("http://localhost:4200")
@CrossOrigin(origins = "https://portfolioweb-ed369.firebaseapp.com/")
public class HabilidadesController {
    
    @Autowired
    HabilidadesService habilidadesService;
    
    //Lee los datos de toda la tabla habilidades
    @GetMapping("/lista")
    public ResponseEntity<List<Habilidades>> list(){
        List<Habilidades> list = habilidadesService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    //Lee los datos de una habilidad específica a traves de un id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id){
        if(!habilidadesService.existsById(id)){
            return new ResponseEntity(new Mensaje("La habilidad seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        Habilidades habilidades = habilidadesService.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }
    //Añade una nueva habilidad  
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody HabilidadesDto habilidadesDto){
        if(StringUtils.isBlank(habilidadesDto.getNombre())){
            return new ResponseEntity(new Mensaje("El campo 'Nombre' es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Habilidades habilidades = new Habilidades(habilidadesDto.getNombre(), habilidadesDto.getValor());
        habilidadesService.save(habilidades);
        return new ResponseEntity(new Mensaje("Habilidad añadida con éxito"), HttpStatus.OK);
    }
    //Actualiza los datos de una habilidad obtenida por id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody HabilidadesDto habilidadesDto){
        if(!habilidadesService.existsById(id)){
            return new ResponseEntity(new Mensaje("La habilidad seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        if(StringUtils.isBlank(habilidadesDto.getNombre())){
            return new ResponseEntity(new Mensaje("El campo 'Nombre' es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Habilidades habilidades = habilidadesService.getOne(id).get();
        habilidades.setNombre(habilidadesDto.getNombre());
        habilidades.setValor(habilidadesDto.getValor());        
        habilidadesService.save(habilidades);
        return new ResponseEntity(new Mensaje("Habilidad actualizada con éxito"), HttpStatus.OK);
    }
    //Elimina una habilidad a través de un id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!habilidadesService.existsById(id)){
            return new ResponseEntity(new Mensaje("La habilidad seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        habilidadesService.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada con éxito"), HttpStatus.OK);
    }
}
