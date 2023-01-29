package com.packageMain.proyecto.dto;


public class TurnoDTO {
    
    private int idturno;
    
    private String fechaturno;
    
    private String medico;
    
    private String personaNombreApellido;
    
    
    
    public TurnoDTO() {
        
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

    public String getPersonaNombreApellido() {
        return personaNombreApellido;
    }

    public void setPersonaNombreApellido(String personaNombreApellido) {
        this.personaNombreApellido = personaNombreApellido;
    }
    
    
    
    
    
}
