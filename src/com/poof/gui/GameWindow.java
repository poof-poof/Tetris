package com.poof.gui;

import javax.swing.*;

public class GameWindow extends JFrame {

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

    GameWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle(TITLE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);

        setVisible(true);
    }

}
