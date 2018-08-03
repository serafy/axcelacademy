package com.axcel.exercise;

import java.awt.*;

public class ColorCube extends Cube {

    private Color color = Color.BLACK;

    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        if (getSide() >=2) {
            this.color = color;
        } else {
            this.color =Color.BLUE;
        }
    }

    public ColorCube(double side) {
        super(side);

    }
}
