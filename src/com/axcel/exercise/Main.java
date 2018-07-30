package com.axcel.exercise;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String msg = "this is runnign class Cube";
        System.out.println(msg) ;

        Cube cube1 = new Cube();
        Cube cube2 = new Cube();

        cube1.setSide(3);
        cube2.setSide(4);

        cube2.setSide(1);
        cube1.setSide(2);


    }
}
