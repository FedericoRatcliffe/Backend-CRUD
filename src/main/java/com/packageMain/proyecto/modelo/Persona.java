package com.packageMain.proyecto.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity @Table(name="personas")
public class Persona {
    
    @Id @Column @GeneratedValue(strategy=GenerationType.IDENTITY) private int id;
    @Column private String name;
    @Column private String apellidos;
    
    
    @JsonManagedReference
    @OneToMany(mappedBy = "persona")
    List<Turno> turnos;
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
    
    
    
    
    
    
}
