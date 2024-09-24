package org.example;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;

public class HTTPEjercicio {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String input = JOptionPane.showInputDialog(null, "Introduce una URI");

        URL url = new URI(input).toURL();

        URLConnection urlConnection = (HttpURLConnection) url.openConnection();

        Map<String, List<String>> headers = urlConnection.getHeaderFields();

        System.out.println("Cabeceras de la respuesta: ");
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String headerName = entry.getKey();
            List<String> headerValues = entry.getValue();

            System.out.println((headerName != null ? headerName : "Status") + ": ");

            for (String value : headerValues) {
                System.out.println(value + " ");
            }
            System.out.println();
        }

        int contentLength = urlConnection.getContentLength();

        if (contentLength == -1){
            System.out.println("No se ha podido determinar el tamaño de la URL");
        }else{
            System.out.println("contentLength = " + contentLength);
        }

        String contentType = urlConnection.getContentType();
        System.out.println(contentType);

        try(
                InputStream is = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        ){
            BufferedWriter writer = null;

            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = fc.showSaveDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File directoryToSave = fc.getSelectedFile();

                String file_name = JOptionPane.showInputDialog(null, "Introduce el nombre del fichero");

                File outputFile = new File(directoryToSave, file_name + ".html");

                writer = new BufferedWriter(new FileWriter(outputFile));

                String line;

                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Contenido de la web copiado correctamente");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}
