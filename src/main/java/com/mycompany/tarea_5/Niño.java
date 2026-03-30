package com.mycompany.tarea_5;

public class Niño extends Persona{
    private String tutor;
    private String telefono;
    private String escuela;
    private int id;
    private String tipo;

    public Niño() {
    }

    public Niño(String tutor, String telefono, String escuela, int id, String tipo, String nombre, String paterno, String materno, int edad) {
        super(nombre, paterno, materno, edad);
        this.tutor = tutor;
        this.telefono = telefono;
        this.escuela = escuela;
        this.id = id;
        this.tipo = tipo;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
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
        return  super.toString() + " tutor = " + tutor + ", telefono = " + telefono + ", escuela = " + escuela + ", id = " + tipo + '}';
    }
    
    
}
