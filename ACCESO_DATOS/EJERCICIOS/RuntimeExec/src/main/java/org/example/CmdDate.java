package org.example;

import java.io.IOException;
import java.util.Scanner;

public class CmdDate {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        String[] command = {"cmd", "/C", "date", "/T"};

        try {

            Process process = runtime.exec(command);

            Scanner sc = new Scanner(process.getInputStream());

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

            int exitStatus = process.waitFor();

            System.out.println("Exit Status = " + exitStatus);

            if (exitStatus != 0){
                Scanner scError = new Scanner(process.getErrorStream());

                while (scError.hasNextLine()) {
                    System.out.println(scError.nextLine());
                }

                scError.close();
            }

        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}