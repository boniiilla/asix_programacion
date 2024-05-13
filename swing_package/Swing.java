package swing_package;

import javax.swing.*;
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
