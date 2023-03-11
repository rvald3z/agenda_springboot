package com.intecap.agenda.controllers;

import com.intecap.agenda.models.Alumno;
import com.intecap.agenda.repositories.AlumnoRepository;
import com.intecap.agenda.services.AlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class AlumnoController {
    @Autowired
    AlumnoServices alumnoServices;

    @GetMapping("/alumno")
    public ArrayList<Alumno> obtenerAlumnos(){
        return (ArrayList<Alumno>) alumnoServices.obtenerAlumnos();
    }

    @PostMapping("/alumno")
    public Alumno guardarAlumno(@RequestBody Alumno alumno){
        return alumnoServices.guardarAlumno(alumno);
    }

}
