package robot;
import javax.swing.*;
import javax.swing.undo.StateEditable;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.*;


public class robotControlGUI {
    private static JTextField pantalla;

     public static void main(String[] args) {
        JFrame frame = new JFrame("ROBOT");
        pantalla = new JTextField();
        JPanel buttonsPanel = new JPanel();


        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton guardar = new JButton("Guardar Estat");
        JButton carregar = new JButton("Carregar Estat");

        
        buttonsPanel.setLayout(new GridLayout(3, 2));
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

        endavant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Se ha movido hacia adelante");
    
            }
        });

        enrere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Se ha movido hacia atrás");            }
        });

        esquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Se ha girado a la izquierda");
            }
        });

        dreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Se ha girado a la derecha");
          
            }
        });





    }
}
