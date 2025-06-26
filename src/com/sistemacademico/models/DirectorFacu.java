package com.sistemacademico.models;

import java.util.ArrayList;

public class DirectorFacu extends PersonaAcademica {
    private ArrayList<ConsejoFac> consejeros;
    private ArrayList<Docente> docentes;
    private ArrayList<Carrera> carreras;

    public DirectorFacu(String nombre, int edad, String apellido, String sector, String facultad, String profesion, String carrera,
                        ArrayList<ConsejoFac> consejeros, ArrayList<Docente> docentes, ArrayList<Carrera> carreras) {
        super(nombre, edad, apellido, sector, facultad, profesion, carrera);
        this.consejeros = consejeros;
        this.docentes = docentes;
        this.carreras = carreras;
    }

    // Getters y setters
    public ArrayList<ConsejoFac> getConsejeros() {
        return consejeros;
    }

    public void setConsejeros(ArrayList<ConsejoFac> consejeros) {
        this.consejeros = consejeros;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }
}
