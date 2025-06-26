package com.sistemacademico.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private ArrayList<Double> notas;
    private LocalDate fechaInscripcion;

    public Inscripcion(Alumno alumno, Curso curso, ArrayList<Double> notas, LocalDate fechaInscripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.notas = notas != null ? notas : new ArrayList<>();
        this.fechaInscripcion = fechaInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }
}
