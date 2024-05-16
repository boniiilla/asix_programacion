package swing_package;

import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.*;

class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALUCLADORA");
        JTextField pantallita = new JTextField(); 
        JButton[] numericButtons = new JButton[10];

        for (int i = 0; i < numericButtons.length; i++) {
            numericButtons[i] = new JButton(Integer.toString(i));
        }

        pantallita.setEditable(false);
        
        frame.add(pantallita);
        for (JButton jButton : numericButtons) {
            frame.add(jButton);
        }
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
