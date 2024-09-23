package org.example;

import java.io.*;

public class EjemploObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

        Alumno david = new Alumno("David", 22);
        Alumno pepe = new Alumno("Pepe", 38);

        oob.writeObject(david);
        oob.writeObject(pepe);

        oob.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

        Object alumno;

        while((alumno = ois.readObject()) != null){
            System.out.println(alumno);
        }
    }
}
