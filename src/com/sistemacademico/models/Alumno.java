package com.sistemacademico.models;

import java.util.ArrayList;

public class Alumno extends PersonaAcademica {
    private ArrayList<Inscripcion> inscripciones;
    private ArrayList<Curso> cursos;

    public Alumno(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.inscripciones = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;

    }


    public void inscribirseCurso(String numeroCurso, ArrayList<Curso> cursosDisponibles) {
        Curso cursoInscripcion = buscarCursoPorNumero(numeroCurso, cursosDisponibles);
        if (cursoInscripcion != null) {
            cursos.add(cursoInscripcion);
        } else {
            throw new RuntimeException("Error, el curso no fue encontrado");
        }
    }

    public void removerInscripcionCurso(String numeroCurso) {
        Curso cursoAEliminar = obtenerCursoPorNumero(numeroCurso);
        if (cursoAEliminar != null) {
            cursos.remove(cursoAEliminar);
        } else {
            throw new RuntimeException("Error, el curso no fue encontrado");
        }
    }

    // Esta busca solo en los cursos del alumno
    private Curso obtenerCursoPorNumero(String numeroCurso) {
        for (Curso curso : cursos) {
            if (curso.getNumero().equals(numeroCurso)) {
                return curso;
            }
        }
        return null;
    }

    // Esta busca en los cursos disponibles del sistema
    private Curso buscarCursoPorNumero(String numeroCurso, ArrayList<Curso> cursosDisponibles) {
        for (Curso curso : cursosDisponibles) {
            if (curso.getNumero().equals(numeroCurso)) {
                return curso;
            }
        }
        return null;
    }


}
