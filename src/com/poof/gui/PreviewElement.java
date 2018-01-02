package com.poof.gui;

import com.poof.core.Element;

import javax.swing.*;
import java.awt.*;

public class PreviewElement extends JPanel {

    PreviewElement(){
        setBackground(Color.GRAY);
    }

    void paintPreview(Element e){
        Graphics graphics = getGraphics();
        graphics.setColor(e.getColor());
        graphics.fillRect(getHeight() / 2 - 50,getWidth() / 2 - 50,50,50);
    }

}
