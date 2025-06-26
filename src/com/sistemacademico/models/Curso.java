package com.sistemacademico.models;

import java.util.ArrayList;

public class Curso {
    private String numero;
    private int maxEstudiantes;
    private ArrayList<Alumno> alumnos;
    private Carrera carrera;
    private ArrayList<Docente> docentes;

    public Curso(String numero, int maxEstudiantes, ArrayList<Alumno> alumnos, Carrera carrera, ArrayList<Docente> docentes) {
        this.numero = numero;
        this.maxEstudiantes = maxEstudiantes;
        this.alumnos = alumnos != null ? alumnos : new ArrayList<>();
        this.carrera = carrera;
        this.docentes = docentes != null ? docentes : new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void inscribirseCurso(Alumno al) {
        alumnos.add(al);
    }

    // 🔁 Añadir o eliminar alumno del curso
    public void alternarInscripcionAlumno(Alumno alumno) {
        if (alumno.getNombre() == null || alumno.getNombre().isBlank() ||
                alumno.getSector() == null || alumno.getSector().isBlank()) {
            throw new RuntimeException("Error: el alumno no tiene nombre o sector definido.");
        }

        if (alumnos.contains(alumno)) {
            alumnos.remove(alumno);
            System.out.println("Alumno eliminado del curso.");
        } else {
            alumnos.add(alumno);
            System.out.println("Alumno añadido al curso.");
        }
    }
}
