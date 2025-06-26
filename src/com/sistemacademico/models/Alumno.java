package com.sistemacademico.models;

import java.util.ArrayList;

public class Alumno extends PersonaAcademica {
    private ArrayList<Inscripcion> inscripciones;

    public Alumno(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.inscripciones = new ArrayList<>();
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void inscribirse(Curso curso, Alumno alumno) {
        if (!yaInscritoEnCurso(curso)) {
            inscripciones.add(new Inscripcion(alumno, curso));
        } else {
            throw new RuntimeException("Ya estás inscrito en el curso");
        }
    }

    public void mostrarCursosInscritos() {
        if (inscripciones.isEmpty()) {
            System.out.println("No ingresaste a ningun curso!");

        } else {
            System.out.println("Estos son tus Cursos");
            for (Inscripcion ins : inscripciones) {
                System.out.println("- " + ins.getCurso().getNumero());
            }
        }
    }


    public boolean buscarInscripcionPorCurso(Curso curso) {
        for (Inscripcion ins : inscripciones) {
            if (curso.equals(ins.getCurso())) {
                return true;
            }
        }
        System.out.println("No estás inscrito en ese curso");
        return false;
    }


    public Inscripcion obtenerInscripcionPorCurso(Curso curso) {
        for (Inscripcion ins : inscripciones) {
            if (curso.equals(ins.getCurso())) {
                return ins;
            }
        }
        return null;
    }


    private boolean yaInscritoEnCurso(Curso curso) {
        return inscripciones.stream().anyMatch(ins -> ins.getCurso().equals(curso));
    }
}
