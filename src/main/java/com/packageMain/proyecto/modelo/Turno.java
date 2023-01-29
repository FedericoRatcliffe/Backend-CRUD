package com.packageMain.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(name = "turnos")
public class Turno {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idturno")
    private int idturno;
    
    
    @Column(name = "fechaturno")
    private String fechaturno;
    
    @Column(name = "medico")
    private String medico;
    
    
    
    @JsonBackReference
    @ManyToOne
    private Persona persona;

    public Turno(){
        
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getFechaturno() {
        return fechaturno;
    }

    public void setFechaturno(String fechaturno) {
        this.fechaturno = fechaturno;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    
    
    
    
    
    
    
}
