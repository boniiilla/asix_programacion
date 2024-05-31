package tetris;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{
    private static int BOARD_WIDHT = 10;
    private static int BOARD_HEIGHT = 30;

    private Tetraminoes[] board;
    
    public Board(){
        board = new Tetraminoes[BOARD_HEIGHT * BOARD_WIDHT];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
