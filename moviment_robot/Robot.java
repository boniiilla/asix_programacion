package moviment_robot;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Coordenade {
    private int x = 0;
    private int y = 0;
    private String direccio = "Nord";
    public static int index = 0;

    public void sumIndex() {
        ++index;
    }

    public void restIndex() {
        --index;
    }

    public void sumX() {
        ++x;
    }

    public void sumY() {
        ++y;
    }

    public void restX() {
        --x;
    }

    public void restY() {
        --y;
    }

    public void setNord() {
        direccio = "Nord";
    }

    public void setSud() {
        direccio = "Sud";
    }

    public void setEst() {
        direccio = "Est";
    }

    public void setOest() {
        direccio = "Oest";
    }

    public void setIndex(int i){
        index = i;
    }

    public int getIndex(){
        return index;
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

        frame.add(buttonPanel);

        frame.setSize(375, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        endavant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (coordenada.getDireccio() == "Nord") {
                    coordenada.sumY();
                } else if (coordenada.getDireccio() == "Oest"){
                    coordenada.restX();
                } else if (coordenada.getDireccio() == "Sud"){
                    coordenada.restY();
                } else if (coordenada.getDireccio() == "Est"){
                    coordenada.sumX();
                }
                System.out.println("Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio());
                pantallita.setText("     Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio() + "     ");
            }
        });

        enrere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (coordenada.getDireccio() == "Nord") {
                    coordenada.restY();
                } else if (coordenada.getDireccio() == "Oest"){
                    coordenada.sumX();
                } else if (coordenada.getDireccio() == "Sud"){
                    coordenada.sumY();
                } else if (coordenada.getDireccio() == "Est"){
                    coordenada.restX();
                }
                System.out.println("Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio());
                pantallita.setText("     Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio() + "     ");
            }
        });

        esquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coordenada.sumIndex();
                System.out.println(coordenada.getIndex());
                if (coordenada.getIndex() == 0) {
                    coordenada.setNord();
                } else if (coordenada.getIndex() == 1){
                    coordenada.setOest();
                } else if (coordenada.getIndex() == 2){
                    coordenada.setSud();
                } else if (coordenada.getIndex() == 3){
                    coordenada.setEst();
                } else if (coordenada.getIndex() == 4){
                    coordenada.setIndex(0);
                    coordenada.setNord();
                }
                System.out.println("Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio());
                pantallita.setText("     Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio() + "     ");
            }
        });

        dreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coordenada.restIndex();

                if (coordenada.getIndex() == 0) {
                    coordenada.setNord();
                } else if (coordenada.getIndex() == 1){
                    coordenada.setOest();
                } else if (coordenada.getIndex() == 2){
                    coordenada.setSud();
                } else if (coordenada.getIndex() == 3){
                    coordenada.setEst();
                } else if (coordenada.getIndex() == -1){
                    coordenada.setIndex(3);
                    coordenada.setEst();;
                }
                System.out.println("Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio());
                pantallita.setText("     Estat del robot: " + coordenada.getCoordenade() + " Direcció: " + coordenada.getDireccio() + "     ");
            }
        });
    }
}
