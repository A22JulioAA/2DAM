package org.example;

import javax.swing.*;
import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println("Con parámetros");
        } else{
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Selecciona un archivo");
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int seleccion = fc.showOpenDialog(null);

            if (seleccion == JFileChooser.APPROVE_OPTION){
                File archivo = fc.getSelectedFile();

                File[] lista_archivos = archivo.listFiles();

                for (File file: lista_archivos){
                    long totalSize = 0;

                    if (file.isDirectory()){
                        File[] subfiles = file.listFiles();

                        for (File subfile: subfiles){
                            totalSize += subfile.length();
                        }
                    }else{
                        totalSize = file.length();
                    }
                    System.out.println(file.getName() + " - " + (file.isDirectory() ? "D" : "F") +
                            " | " + totalSize + " bytes");
                }
            }


        }

    }
}
