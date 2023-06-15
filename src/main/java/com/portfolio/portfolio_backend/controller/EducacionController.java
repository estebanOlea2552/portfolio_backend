package com.portfolio.portfolio_backend.controller;

import com.portfolio.portfolio_backend.dto.EducacionDto;
import com.portfolio.portfolio_backend.model.Educacion;
import com.portfolio.portfolio_backend.services.EducacionService;
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
@RequestMapping("/educacion")
//@CrossOrigin("http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-prueba-crud.firebaseapp.com/")
public class EducacionController {
    
    @Autowired
    EducacionService educacionService;
    
    //Lee los datos de toda la tabla educacion
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    //Lee los datos de una escuela específica a partir de un id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!educacionService.existsById(id)){
            return new ResponseEntity(new Mensaje("La escuela seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        Educacion educacion = educacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    //Añade una nueva escuela   
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){
        if(StringUtils.isBlank(educacionDto.getEscuela())){
            return new ResponseEntity(new Mensaje("El campo 'Escuela' es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = new Educacion(educacionDto.getEscuela(), educacionDto.getCarrera());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Escuela y carrera añadidas con éxito"), HttpStatus.OK);
    }
    //Actualiza los datos de una escuela obtenida por id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody EducacionDto educacionDto){
        if(!educacionService.existsById(id)){
            return new ResponseEntity(new Mensaje("La escuela seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        if(StringUtils.isBlank(educacionDto.getEscuela())){
            return new ResponseEntity(new Mensaje("El campo 'Escuela' es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setEscuela(educacionDto.getEscuela());
        educacion.setCarrera(educacionDto.getCarrera());        
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Escuela y carrera actualizados con éxito"), HttpStatus.OK);
    }
    //Elimina una escuela a través de un id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!educacionService.existsById(id)){
            return new ResponseEntity(new Mensaje("La escuela seleccionada no se encuentra en la base de datos"), HttpStatus.NOT_FOUND);
        }
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje("Escuela y carrera eliminados con éxito"), HttpStatus.OK);
    }
}
