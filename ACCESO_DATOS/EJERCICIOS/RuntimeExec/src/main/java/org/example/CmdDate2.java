package org.example;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CmdDate2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        String[] command = {"cmd", "/C", "date"};

        try {

            Process process = runtime.exec(command);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));

            String newDate = JOptionPane.showInputDialog(null, "New date");

            bw.write(newDate);
            bw.close();

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