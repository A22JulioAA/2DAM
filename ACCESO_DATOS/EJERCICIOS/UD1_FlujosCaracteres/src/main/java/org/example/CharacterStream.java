package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        int c;
        Reader reader = new InputStreamReader(System.in);

        while((c = reader.read()) != -1){
            System.out.println(c);
        }

    }
}
