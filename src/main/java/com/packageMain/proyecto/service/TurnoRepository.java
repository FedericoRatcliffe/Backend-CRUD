package com.packageMain.proyecto.service;

import com.packageMain.proyecto.modelo.Turno;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {
    
    List<Turno>findAll();

}
