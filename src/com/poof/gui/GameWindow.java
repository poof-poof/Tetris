package com.poof.gui;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
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

        btnExitGame.addActionListener(this);
        btnNewGame.addActionListener(this);
        btnPauseGame.addActionListener(this);

        addComponents();
        add(rightPanel, BorderLayout.EAST);

        gameField = new GameField();
        add(gameField);

        setVisible(true);
    }

    void addComponents(){
        rightPanel = new JPanel(new GridLayout(2,1));
        JPanel btnPanel = new JPanel(new GridLayout(3,1));
        JPanel symbolPanel = new JPanel(new GridLayout(2,1));

        symbolPanel.add(new JLabel("the next element:"));

        btnPanel.add(btnPauseGame);
        btnPanel.add(btnNewGame);
        btnPanel.add(btnExitGame);

        rightPanel.add(symbolPanel);
        rightPanel.add(btnPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
