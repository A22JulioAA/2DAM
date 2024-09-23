package org.example;

import java.io.Serializable;

public class Alumno implements Serializable {
    private String name;
    private int age;

    public Alumno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Me llamo " + this.name + " y tengo " + this.age + " años";
    }
}
