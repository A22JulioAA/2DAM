package org.example;

import java.io.*;

public class FlujosByte_Ejercicio1 {
    public static void main(String[] args) {

        try(ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{12, 45, 35, 67, 44});
            FileWriter out = new FileWriter("src/main/resources/nohaycole.txt")){

            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
