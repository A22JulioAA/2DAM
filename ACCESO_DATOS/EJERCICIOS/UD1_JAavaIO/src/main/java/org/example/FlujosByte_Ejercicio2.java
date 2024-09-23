package org.example;

import javax.swing.*;
import java.io.*;

public class FlujosByte_Ejercicio2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        String mensajeMenu = "1. Introducir persona\n2. Mostrar todas las personas\n" +
                "3. Buscar persona(nombre)\n4. Salir";

        String opcion = JOptionPane.showInputDialog(null, mensajeMenu);

        switch (opcion){
            case "1":
                añadirPersona();
                break;
            case "2":
                mostrarPersonas();
                break;
            case "3":
                System.out.println("Buscar persona");
                break;
            case "4":
                break;
            default:
                System.out.println("Esa opción no es correcta");
                break;
        }

    }

    public static void añadirPersona() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccionPersonas.txt", true));

        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona");
        String edad = JOptionPane.showInputDialog("Introduce la edad de la persona");

        oos.writeObject(new Persona(nombre, Integer.parseInt(edad)));

    }

    public static void mostrarPersonas() throws IOException, ClassNotFoundException{
        Boolean fin = false;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\a22julioaa\\Desktop\\2DAM\\2DAM\\ACCESO_DATOS\\EJERCICIOS\\UD1_JAavaIO\\coleccionPersonas.txt"));
        Persona persona;
        Object objeto;

        while((objeto=ois.readObject()) != null){
           persona = (Persona) objeto;

            System.out.println(persona);
        }
    }
}
