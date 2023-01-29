package com.packageMain.proyecto.modelo;

import com.packageMain.proyecto.service.TurnoRepository;
import com.packageMain.proyecto.service.TurnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TurnoServiceImp implements TurnoService {
    
    @Autowired
    private TurnoRepository turnoRepositorio;
    
    
    @Override
    public List<Turno> listarturnos() {
        return turnoRepositorio.findAll();
    }

    
    
    
    
    
    @Override
    public Turno listarIdTurno(int idturno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
