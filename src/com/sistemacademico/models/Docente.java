package com.sistemacademico.models;

import java.util.ArrayList;

public class Docente extends PersonaAcademica {
    private ArrayList<Curso> cursos;

    public Docente(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera, ArrayList<Curso> cursos) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.cursos = cursos;
    }


}
