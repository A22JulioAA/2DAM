package org.example;

import javax.swing.*;
import java.io.IOException;

public class OpenExecutables {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        JOptionPane.showMessageDialog(null, "Available processors for the JVM: " + runtime.availableProcessors());

        String optionsMessage = "Select a program to open:\n1. Google Chrome\n2. Youtube on Google\n3. Notepad";
        String option = JOptionPane.showInputDialog(null, optionsMessage);

        String[] command_chrome = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"};
        String[] command_youtube = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "www.youtube.es"};
        String[] command_notepad = {"C:\\Windows\\notepad.exe"};

        try {
            switch (option) {
                case "1":
                    Process process_chrome = runtime.exec(command_chrome);

                    int exitStatus
                    break;
                case "2":
                    Process process_youtube = runtime.exec(command_youtube);
                    break;
                case "3":
                    Process process_notepad = runtime.exec(command_notepad);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "That option is not allowed");
                    break;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
