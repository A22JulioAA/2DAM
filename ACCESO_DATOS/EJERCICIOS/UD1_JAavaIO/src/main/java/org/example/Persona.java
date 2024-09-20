package org.example;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    @Override
    public String toString(){
        return "Mi nombre es " + this.nombre + " y tengo " + this.edad + " años.";
    }
}
