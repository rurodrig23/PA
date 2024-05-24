package robot;
import javax.swing.*;
import javax.swing.undo.StateEditable;

import java.awt.*;


public class robotControlGUI {
    private JTextField pantalla;

     public static void main(String[] args) {
        JFrame frame = new JFrame("ROBOT");
        JTextField pantalla = new JTextField();
        JPanel buttonsPanel = new JPanel();


        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton guardar = new JButton("Guardar Estat");
        JButton carregar = new JButton("Carregar Estat");

        
        buttonsPanel.setLayout(new GridLayaout(3, 2));
        buttonsPanel.add(endavant);
        buttonsPanel.add(enrere);
        buttonsPanel.add(esquerra);
        buttonsPanel.add(dreta);
        buttonsPanel.add(guardar);
        buttonsPanel.add(carregar);

        frame.setLayout(new BorderLayout());
        frame.add(buttonsPanel, BorderLayout.NORTH);
        frame.add(pantalla, BorderLayout.CENTER);
    
        frame.setSize(375, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
