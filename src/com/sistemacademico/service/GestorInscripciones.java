package com.sistemacademico.service;

import com.sistemacademico.models.Alumno;
import com.sistemacademico.models.Curso;
import com.sistemacademico.models.Inscripcion;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorInscripciones {

    public Inscripcion inscribirAlumnoEnCurso(Alumno alumno, Curso curso) {
        if (alumno == null || curso == null) {
            throw new IllegalArgumentException("Alumno o curso no pueden ser nulos");
        }
        return null;
    }
}
