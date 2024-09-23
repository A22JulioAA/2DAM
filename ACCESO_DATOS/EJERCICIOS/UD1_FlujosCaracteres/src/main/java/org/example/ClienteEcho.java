package org.example;

import java.io.*;

public class ClienteEcho {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("kk.txt"));

        bw.write("El mundo es maravilloso");

        bw.flush();

        bw.close();

        Reader r = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(r);

        String linea;

        while(!(linea = br.readLine()).equalsIgnoreCase("_EXIT_")){
            System.out.println(linea);
        }
    }
}
