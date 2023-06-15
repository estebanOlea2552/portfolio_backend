package com.portfolio.portfolio_backend.controller;

import com.portfolio.portfolio_backend.dto.AcercaDeDto;
import com.portfolio.portfolio_backend.model.AcercaDe;
import com.portfolio.portfolio_backend.services.AcercaDeService;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acercade")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-prueba-crud.firebaseapp.com/")
public class AcercaDeController {
    
    @Autowired
    AcercaDeService acercaDeService;
    
    //Lee los datos de toda la tabla AcercaDe
    @GetMapping("/lista")
    public ResponseEntity<List<AcercaDe>> list(){
        List<AcercaDe> list = acercaDeService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    //Lee los datos de un AcercaDe específico a partir de un id
    @GetMapping("/detail/{id}")
    public ResponseEntity<AcercaDe> getById(@PathVariable("id") int id){
        if(!acercaDeService.existsById(id)){
            return new ResponseEntity(new Mensaje("El apartado 'Acerca de' seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        AcercaDe acercaDe = acercaDeService.getOne(id).get();
        return new ResponseEntity(acercaDe, HttpStatus.OK);
    }
    //Crea un nuevo encabezado    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AcercaDeDto acercaDeDto){
        if(StringUtils.isBlank(acercaDeDto.getDescripcion())){
            return new ResponseEntity(new Mensaje("La descripción es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        AcercaDe acercaDe = new AcercaDe(acercaDeDto.getDescripcion());
        acercaDeService.save(acercaDe);
        return new ResponseEntity(new Mensaje("Apartado 'Acerca de' creado"), HttpStatus.OK);
    }
    //Actualiza los datos del AcercaDe obtenido por id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody AcercaDeDto acercaDeDto){
        if(!acercaDeService.existsById(id)){
            return new ResponseEntity(new Mensaje("El apartado 'Acerca de' seleccionado no existe"), HttpStatus.NOT_FOUND);
        }
        if(StringUtils.isBlank(acercaDeDto.getDescripcion())){
            return new ResponseEntity(new Mensaje("La descripción es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        AcercaDe acercaDe = acercaDeService.getOne(id).get();
        acercaDe.setDescripcion(acercaDeDto.getDescripcion());        
        acercaDeService.save(acercaDe);
        return new ResponseEntity(new Mensaje("Apartado 'Acerca de' actualizado"), HttpStatus.OK);
    }
}
