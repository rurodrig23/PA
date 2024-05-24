package robot;
import javax.swing.*;
import javax.swing.undo.StateEditable;

import java.awt.GridLayout;
import java.awt.*;


public class robotControlGUI {
     public static void main(String[] args) {
        JFrame frame = new JFrame("ROBOT");
        JTextField pantalla = new JTextField();
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 2));


        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton guardar = new JButton("Guardar Estat");
        JButton carregar = new JButton("Carregar Estat");

        
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));

        buttonsPanel.add(endavant);
        buttonsPanel.add(enrere);
        buttonsPanel.add(esquerra);
        buttonsPanel.add(dreta);
        buttonsPanel.add(guardar);
        buttonsPanel.add(carregar);

        frame.setLayout(new GridLayout(3, 2));
        frame.add(buttonsPanel);
        frame.add(pantalla);
      

        frame.setSize(375, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
