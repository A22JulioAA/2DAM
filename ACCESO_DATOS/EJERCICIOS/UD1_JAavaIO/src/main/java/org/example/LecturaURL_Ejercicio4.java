package org.example;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LecturaURL_Ejercicio4 {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {

        /*Ejercicio 4 - Lectura de URL*/

        try {
            String mensajeOpciones = "Seleccione lo que desea hacer: \n1. Descargar URL\n2. Descargar imagen";
            String opcion = JOptionPane.showInputDialog(mensajeOpciones);

            switch (opcion){
                case "1":
                    String urlString = JOptionPane.showInputDialog("Introduce la URL");
                    URI uri = new URI(urlString);

                    InputStream is = uri.toURL().openStream();
                    InputStreamReader isr = new InputStreamReader(is);

                    int nextByte;

                    System.out.println(isr.read());

                    /*while((nextByte = is.read()) != -1){
                        System.out.println(nextByte);
                    }*/
                case "2":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción no es correcta!");
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
