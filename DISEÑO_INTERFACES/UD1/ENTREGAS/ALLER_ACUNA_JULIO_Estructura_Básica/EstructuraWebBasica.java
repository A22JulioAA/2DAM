package org.example;

import javax.swing.*;
import java.awt.*;

public class EstructuraWebBasica {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setTitle("Estructura Básica Web");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.setLayout(new BorderLayout());

        /* Panel y label del header */

        JPanel titulo = new JPanel();
        titulo.setBackground(Color.decode("#cd5c5c"));
        titulo.setPreferredSize(new Dimension(100, 100));
        titulo.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.white));

        JLabel tituloLabel = new JLabel("<header>", JLabel.CENTER);
        tituloLabel.setForeground(Color.white);

        /* Panel y label del nav */

        JPanel nav = new JPanel();
        nav.setBackground(Color.decode("#cd5c5c"));
        nav.setPreferredSize(new Dimension(50, 300));
        nav.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 10, Color.white));

        JLabel navLabel = new JLabel("<nav>", JLabel.CENTER);
        navLabel.setForeground(Color.white);

        /* Panel y label del centro */

        JPanel section = new JPanel();
        section.setBackground(Color.decode("#cd5c5c"));
        section.setPreferredSize(new Dimension(300, 100));
        section.setLayout(new BorderLayout());

        JLabel sectionLabel = new JLabel("<section>", JLabel.CENTER);
        sectionLabel.setForeground(Color.white);
        sectionLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        section.add(sectionLabel, BorderLayout.NORTH);  // Añadir el label al norte del panel

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(3, 1, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.setBackground(Color.decode("#cd5c5c"));

        JPanel headerSection = new JPanel();
        headerSection.setBackground(Color.decode("#bdb76b"));
        JLabel headerSectionLabel = new JLabel("<header>", JLabel.CENTER);
        headerSectionLabel.setForeground(Color.white);
        headerSection.add(headerSectionLabel);
        contentPanel.add(headerSection);

        JPanel articleSection = new JPanel();
        articleSection.setBackground(Color.decode("#bdb76b"));
        JLabel articleSectionLabel = new JLabel("<article>", JLabel.CENTER);
        articleSectionLabel.setForeground(Color.white);
        articleSection.add(articleSectionLabel);
        contentPanel.add(articleSection);

        JPanel footerSection = new JPanel();
        footerSection.setBackground(Color.decode("#bdb76b"));
        JLabel footerSectionLabel = new JLabel("<footer>", JLabel.CENTER);
        footerSectionLabel.setForeground(Color.white);
        footerSection.add(footerSectionLabel);
        contentPanel.add(footerSection);

        section.add(contentPanel, BorderLayout.CENTER);

        /* Panel y label del aside */

        JPanel aside = new JPanel();
        aside.setBackground(Color.decode("#cd5c5c"));
        aside.setPreferredSize(new Dimension(50, 300));
        aside.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Color.white));

        JLabel asideLabel = new JLabel("<aside>", JLabel.CENTER);
        asideLabel.setForeground(Color.white);

        /* Panel y label del footer */

        JPanel footer = new JPanel();
        footer.setBackground(Color.decode("#cd5c5c"));
        footer.setPreferredSize(new Dimension(400, 100));
        footer.setBorder(BorderFactory.createMatteBorder(10, 0, 0, 0, Color.white));

        JLabel footerLabel = new JLabel("<footer>", JLabel.CENTER);
        footerLabel.setForeground(Color.white);

        /* Posicionamiento */

        titulo.add(tituloLabel);
        ventana.add(titulo, BorderLayout.NORTH);

        nav.add(navLabel);
        ventana.add(nav, BorderLayout.WEST);

        ventana.add(section, BorderLayout.CENTER);

        aside.add(asideLabel);
        ventana.add(aside, BorderLayout.EAST);

        footer.add(footerLabel);
        ventana.add(footer, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}
