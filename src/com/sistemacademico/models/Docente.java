package com.sistemacademico.models;

import java.util.ArrayList;

public class Docente extends PersonaAcademica {
    private ArrayList<Curso> cursos;

    public Docente(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera, ArrayList<Curso> cursos) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.cursos = cursos;
    }


    public void asignarNota(Alumno alumno, Curso curso, double nota) {
        if (!curso.cursoExistente()) {
            throw new RuntimeException("No existe el curso que buscas");
        }
        if (!curso.buscarAlumno(alumno)) {
            throw new RuntimeException("No existe el estudiante");
        }
        Inscripcion ins = alumno.obtenerInscripcionPorCurso(curso);
        if (ins != null) {
            ins.setNota(nota);
        } else {
            throw new RuntimeException("El alumno no está inscrito en ese curso.");
        }

    }


}
