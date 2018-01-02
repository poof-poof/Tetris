package com.poof.gui;

import com.poof.core.Element;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    Element e;

    GameField(){
        setBackground(Color.BLACK);
        this.e = new Element();
    }

    public Element getE() {
        return e;
    }
}
