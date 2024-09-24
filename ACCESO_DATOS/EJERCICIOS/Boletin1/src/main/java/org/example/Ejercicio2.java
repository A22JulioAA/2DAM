package org.example;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Ejercicio 2. Programa que recoge un fichero y muestra sus estadísticas.
         * */

        String fileName = JOptionPane.showInputDialog(null, "Introduce el nombre del archivo: ");

        File f = new File(fileName);

        EstatisticaFile ef = new EstatisticaFile(f);

        try (var fr = new FileWriter(f)) {

            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
