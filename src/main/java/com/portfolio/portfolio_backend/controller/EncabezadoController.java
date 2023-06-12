package com.portfolio.portfolio_backend.controller;

import com.portfolio.portfolio_backend.dto.EncabezadoDto;
import com.portfolio.portfolio_backend.model.Encabezado;
import com.portfolio.portfolio_backend.services.EncabezadoService;
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
@RequestMapping("/encabezado")
//@CrossOrigin("http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-prueba-crud.web.app/")
public class EncabezadoController {
    
    @Autowired
    EncabezadoService encabezadoService;
    
    //Lee los datos de toda la tabla encabezado
    @GetMapping("/lista")
    public ResponseEntity<List<Encabezado>> list(){
        List<Encabezado> list = encabezadoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }     
    //Lee los datos de un encabezado específico a partir de un id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Encabezado> getById(@PathVariable("id") int id){
        if(!encabezadoService.existsById(id)){
            return new ResponseEntity(new Mensaje("El encabezado seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        Encabezado encabezado = encabezadoService.getOne(id).get();
        return new ResponseEntity(encabezado, HttpStatus.OK);
    }    
    //Crea un nuevo encabezado    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EncabezadoDto encabezadoDto){
        if(StringUtils.isBlank(encabezadoDto.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Encabezado encabezado = new Encabezado(encabezadoDto.getPortada(), encabezadoDto.getPerfil(), encabezadoDto.getNombre(), encabezadoDto.getDescripcion(), encabezadoDto.getResidencia());
        encabezadoService.save(encabezado);
        return new ResponseEntity(new Mensaje("Encabezado creado"), HttpStatus.OK);
    }    
    //Actualiza los datos del encabezado obtenido por id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody EncabezadoDto encabezadoDto){
        if(!encabezadoService.existsById(id)){
            return new ResponseEntity(new Mensaje("El encabezado seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        if(StringUtils.isBlank(encabezadoDto.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Encabezado encabezado = encabezadoService.getOne(id).get();
        encabezado.setPortada(encabezadoDto.getPortada());
        encabezado.setPerfil(encabezadoDto.getPerfil());
        encabezado.setNombre(encabezadoDto.getNombre());
        encabezado.setDescripcion(encabezadoDto.getDescripcion());
        encabezado.setResidencia(encabezadoDto.getResidencia());
        encabezadoService.save(encabezado);
        return new ResponseEntity(new Mensaje("Encabezado actualizado"), HttpStatus.OK);
    }    
    //Elimina los datos de la tabla encabezado a traves de un id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!encabezadoService.existsById(id)){
            return new ResponseEntity(new Mensaje("El encabezado seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        encabezadoService.delete(id);
        return new ResponseEntity(new Mensaje("Encabezado eliminado"), HttpStatus.OK);
    }           
}
