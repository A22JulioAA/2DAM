package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        File archivoPrueba = new File("C:\\Users\\julio\\OneDrive\\Escritorio\\2DAM\\ACCESO_DATOS\\EJERCICIOS\\UD1_File_Ejercicio1\\src\\main\\java\\org\\example\\prueba.txt");

        if (archivoPrueba.exists()) {
            System.out.println("Ruta absoluta: " + archivoPrueba.getAbsolutePath());
            System.out.println("Nombre del archivo: " + archivoPrueba.getName());
            System.out.println("Tamaño: " + archivoPrueba.length());
            System.out.println("Última modificación: " + new Date(archivoPrueba.lastModified()));
            System.out.println("Es un directorio: " + archivoPrueba.isDirectory());
        }else{
            System.out.println("El archivo indicado no existe. Creando temporalmente...");

            File temporaryFile = File.createTempFile("archivoPrueba", "temporal");

            System.out.println("Temporary File = " + temporaryFile);
        }


    }
}
