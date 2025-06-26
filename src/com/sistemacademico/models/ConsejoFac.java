package com.sistemacademico.models;

import java.util.ArrayList;

public class ConsejoFac extends PersonaAcademica {
    private ArrayList<Alumno> ayudantes;

    public ConsejoFac(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera, ArrayList<Alumno> ayudantes) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.ayudantes = ayudantes;
    }
}
