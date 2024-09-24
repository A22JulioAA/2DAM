package org.example;

import java.io.IOException;

public class NotepadPlusPlusFile {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        String[] command = {"C:\\Program Files\\Notepad++\\notepad++.exe", "src/main/resources/info.txt"};

        try {

            Process process = runtime.exec(command);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}