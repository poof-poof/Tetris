package com.poof.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow();
            }
        });
    }

    public static final int WIDTH = 400;
    public static final int HEIGHT = 550;
    public static final String TITLE = "Tetris by POOF";

    private GameField gameField;
    private JPanel rightPanel;
    private JButton btnNewGame = new JButton("Start new game");
    private JButton btnExitGame = new JButton("Exit");
    private JButton btnPauseGame = new JButton("Pause game");

    GameWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle(TITLE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);

        gameField = new GameField();
        add(gameField);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
