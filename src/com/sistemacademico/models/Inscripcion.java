package com.sistemacademico.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private Double nota;

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.nota = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }


}
