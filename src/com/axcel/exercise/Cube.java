package com.axcel.exercise;

public class Cube {
    private double side;
    private double volum;

    public void setSide(double side) {
        this.side = side;
        computeVolum();
    }

    public void computeVolum(){
        this.volum = side* side * side ;

    }

    public double getSide() {
        return side;
    }

    public double getVolum() {
        return volum;
    }




}
