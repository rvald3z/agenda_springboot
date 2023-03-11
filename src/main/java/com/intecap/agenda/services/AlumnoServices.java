package com.intecap.agenda.services;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlumnoServices{
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<Alumno> obtenerAlumnos(){
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    public Alumno guardarAlumno(Alumno alumno){
        return alumnoRepository.save(alumno);
    }
}
