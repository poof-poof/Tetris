package com.poof.core;

import java.awt.*;

public class Element {

    private final int SIZE = 15;
    private Color color;

    public Element(){
        setColor((int)(Math.random() * 256f),
                (int)(Math.random() * 256f),
                (int)(Math.random() * 256f));
    }

    public Color getColor() {
        return color;
    }

    public void setColor(int red, int green, int blue) {
        this.color = new Color(red,green,blue);
    }

    public int getSIZE() {
        return SIZE;
    }
}
