package swing_package;

import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALUCLADORA");
        JTextField pantallita = new JTextField(); 
        JButton[] numericButtons = new JButton[10];
        GridLayout managerButton = new GridLayout(4, 3);
        BoxLayout managerGeneral = new BoxLayout(frame, BoxLayout.Y_AXIS);

        for (int i = 0; i < numericButtons.length; i++) {
            numericButtons[i] = new JButton(Integer.toString(i));
        }
        
        pantallita.setEditable(false);

        for (JButton jButton : numericButtons) {
            managerButton.addLayoutComponent(jButton.getName(), jButton);
        }
        frame.add(pantallita);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
