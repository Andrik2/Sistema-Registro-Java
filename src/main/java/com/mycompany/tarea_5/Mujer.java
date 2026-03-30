package com.mycompany.tarea_5;

public class Mujer extends Persona{
    private String facultad;
    private int id;
    private String tipo;

    public Mujer() {
    }

    public Mujer(String facultad, int id, String tipo, String nombre, String paterno, String materno, int edad) {
        super(nombre, paterno, materno, edad);
        this.facultad = facultad;
        this.id = id;
        this.tipo = tipo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    @Override
    public String toString() {
        return super.toString() + " facultad = " + facultad + ", id = " +tipo + '}';
    }
}
