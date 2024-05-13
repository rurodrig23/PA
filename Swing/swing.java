package Swing;
import javax.swing.*;
import javax.swing.undo.StateEditable;

import java.awt.event.*;


class swing {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JTextField pantalla = new JTextField();
        JButton[] numericButtons = new JButton[10];

        for (int i = 0; i < numericButtons.length; i++){
            numericButtons[i] = new JButton(Integer.toString(i));

        }

        pantalla.setEditable(false);

        frame.add(pantalla);
        for (JButton jButton : numericButtons) {
            frame.add(jButton);
            
        }
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
