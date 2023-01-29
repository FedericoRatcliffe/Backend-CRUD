package com.packageMain.proyecto.service;

import com.packageMain.proyecto.modelo.Persona;
import java.util.List;
import org.springframework.stereotype.Service;




@Service
public interface PersonaService {
    
    // lista de tipo Persona
    List<Persona>listar(); //listar todas las personas
    // objeto de tipo persona
    Persona listarId(int id); //listar una persona
    Persona add(Persona p);//agregar una persona
    Persona edit(Persona p);//editar una persona
    Persona delete(int id);//eliminar una persona
    
}
