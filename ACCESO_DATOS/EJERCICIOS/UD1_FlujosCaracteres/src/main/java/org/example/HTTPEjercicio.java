package org.example;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class HTTPEjercicio {
    public static void main(String[] args) throws URISyntaxException, IOException {
        /**
         * @author: Julio
         * @version: 1.0.0
         * */

        String input = JOptionPane.showInputDialog(null, "Introduce una URL");

        URL url = new URI(input).toURL();

        URLConnection uc = url.openConnection();
        InputStream is = uc.getInputStream();



    }
}
