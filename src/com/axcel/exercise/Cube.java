package com.axcel.exercise;

public class Cube {
    float side;
    float volum;

    public void setSide(float side) {
        this.side = side;
        computeVolum();
    }

    public void computeVolum(){
        this.volum = side* side * side ;

    }

    public float getSide() {
        return side;
    }

    public float getVolum() {
        return volum;
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube();

        cube1.setSide(3);
        cube2.setSide(4);

        cube2.setSide(1);
        cube1.setSide(2);


    }


}
