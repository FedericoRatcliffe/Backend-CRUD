package com.packageMain.proyecto.service;

import com.packageMain.proyecto.modelo.Turno;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public interface TurnoService {
    
    
    List<Turno>listarturnos();    
    
    Turno listarIdTurno(int idturno);
    
    
    
    
}
