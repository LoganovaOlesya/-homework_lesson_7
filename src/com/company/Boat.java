package com.company;

public class Boat extends TransportForWater {

    @Override
    public void move(int yards) {
        yards++;
    }

    @Override
    public void makeASignal() {
        System.out.println("I'm too rich to drive just a car");
    }
}