package moviment_robot;

import javax.swing.*;
import java.awt.GridLayout;

public class Robot {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Control de Robot");
        JTextField pantallita = new JTextField();
        JPanel buttonPanel = new JPanel();

        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton save_stat = new JButton("Guardar Estat");
        JButton load_stat = new JButton("Carregar Estat");

        GridLayout managerButton = new GridLayout(3, 3);
        BoxLayout managerGeneral = new BoxLayout(frame, BoxLayout.Y_AXIS);

        buttonPanel.add(endavant);
        buttonPanel.add(enrere);
        buttonPanel.add(esquerra);
        buttonPanel.add(dreta);
        buttonPanel.add(save_stat);
        buttonPanel.add(load_stat);

        frame.add(pantallita);
        frame.add(buttonPanel);

        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
