package com.axcel.exercise;

public class Sh1 extends MyShape {
     double side;

    double length;
    double hight;

    public Sh1(double side, double length, double hight) {
        this.side = side;
        this.length = length;
        this.hight = hight;
        ComputeVolum();
    }
    public Sh1(){

    }


    public void setSide(double inputSide) {
        side = inputSide;
        ComputeVolum();
    }
    public void setLength(double length) {
        this.length = length;
        ComputeVolum();
    }
    public void setHight(double hight) {
        this.hight = hight;
        ComputeVolum();
    }

    public double getLength() {
        return length;
    }

    public double getHight() {
        return hight;
    }
    public double getSide() {
        return side;
    }
    void ComputeVolum(){
        volum =  side*length*hight;

    }



}
