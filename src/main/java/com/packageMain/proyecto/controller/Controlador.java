package com.packageMain.proyecto.controller;

import com.packageMain.proyecto.dto.TurnoDTO;
import com.packageMain.proyecto.modelo.Persona;
import com.packageMain.proyecto.modelo.Turno;
import com.packageMain.proyecto.service.PersonaRepositorio;
import com.packageMain.proyecto.service.PersonaService;
import com.packageMain.proyecto.service.TurnoRepository;
import com.packageMain.proyecto.service.TurnoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





//EL CONTROLADOR HACE REFERENCIA AL FRONTEND, BRINDANDO TODO EL SERVICIO QUE NOS SOLICITE
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class Controlador {
    
    @Autowired
    PersonaService service;
    
    @Autowired
    TurnoRepository turnorepositorio;
    
    
    @Autowired
    TurnoService turnoServicio;
    
    @GetMapping(path ={"/"})
    public List<Persona>listar(){
        return service.listar();
    }
    
    //AGREGAR USUARIO
    @PostMapping("/")
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    
    //LISTAR POR ID
    @GetMapping(path ={"/{id}"})
    public Persona listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    //METODO ACTUALIZAR/EDITAR
    @PutMapping(path ={"/{id}"})
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    
    
    //BORRAR
    @DeleteMapping(path ={"/{id}"})
    public Persona delete(@PathVariable("id") int id){
        return service.delete(id);
    }
    
    
    //////////////////
    //LISTAR TURNO
    @GetMapping(path = "/turno")
    public List<TurnoDTO>listarturnos(){
        List<TurnoDTO> turnos = new ArrayList<>();
        List<Turno> turnoEntities = turnorepositorio.findAll();
        
        for(Turno turnoEntity:turnoEntities){
            TurnoDTO turno = new TurnoDTO();
            turno.setIdturno(turnoEntity.getIdturno());
            turno.setFechaturno(turnoEntity.getFechaturno());
            turno.setMedico(turnoEntity.getMedico());
            Persona persona = turnoEntity.getPersona();
            turno.setPersonaNombreApellido(persona.getName()+" "+persona.getApellidos());
            turnos.add(turno);
        }
        
        return turnos;
    }
    
    
    
    
    
}
