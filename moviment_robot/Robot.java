package moviment_robot;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;

class Coordenade {
    private int x = 0;
    private int y = 0;
    private String direccio = "Nord";

    public void sumX(int x) {
        ++x;
    }

    public void sumY(int y) {
        ++y;
    }

    public String getDireccio() {
        return direccio;
    }
    public String getCoordenade(){
        return "(" + x + ", " + y + ")";
    }
}

public class Robot {
    public static void main(String[] args) {
        Coordenade coordenada = new Coordenade();

        JFrame frame = new JFrame("Control de Robot");
        JTextField pantallita = new JTextField("     Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio() + "     ");
        JPanel buttonPanel = new JPanel();

        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton save_stat = new JButton("Guardar Estat");
        JButton load_stat = new JButton("Carregar Estat");

        pantallita.setEditable(false);

        buttonPanel.add(pantallita);
        buttonPanel.add(endavant);
        buttonPanel.add(enrere);
        buttonPanel.add(esquerra);
        buttonPanel.add(dreta);
        buttonPanel.add(save_stat);
        buttonPanel.add(load_stat);
        pantallita.setSize(100,300);

        frame.add(buttonPanel);

        frame.setSize(375, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
