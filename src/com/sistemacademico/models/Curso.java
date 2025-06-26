package com.sistemacademico.models;

import java.util.ArrayList;

import java.util.ArrayList;

public class Curso {
    private String numero;
    private int maxEstudiantes;
    private Carrera carrera;
    private ArrayList<Docente> docentes;
    private ArrayList<Alumno> alumnos;


    public Curso(String numero, int maxEstudiantes, Carrera carrera, ArrayList<Docente> docentes, ArrayList<Alumno> alumnos) {
        this.numero = numero;
        this.maxEstudiantes = maxEstudiantes;
        this.carrera = carrera;
        this.docentes = docentes != null ? docentes : new ArrayList<>();
        this.alumnos = alumnos != null ? alumnos : new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }


    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }


    public boolean buscarAlumno(Alumno estudianteBuscado) {
        for (Alumno alumno : alumnos) {
            if (alumno.equals(estudianteBuscado)) {
                return true;
            }
        }
        return false;
    }


    public boolean cursoExistente() {
        if (numero != null && numero != "") {
            return true;
        }
        return false;
    }

}
