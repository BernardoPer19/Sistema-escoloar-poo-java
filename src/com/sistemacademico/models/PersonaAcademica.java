package com.sistemacademico.models;

abstract public class PersonaAcademica {
    private String nombre;
    private int edad;
    private String apellido;
    private String sector;
    private String facultad;
    private String profesion;
    private String carrera;

    public PersonaAcademica(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.sector = sector;
        this.facultad = facultad;
        this.profesion = profesion;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSector() {
        return sector;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getCarrera() {
        return carrera;
    }
}
