package org.example;

public class ColeccionPersonas {

    private Persona[] coleccion;

    public ColeccionPersonas(Persona[] coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Persona persona: coleccion){
            sb.append(persona.getNombre());
        }

        return sb.toString();
    }
}
