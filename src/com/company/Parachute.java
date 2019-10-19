package com.company;

public class Parachute extends TransportOnAir{

    @Override
    public void move(int altitude) {
        altitude--;
    }

    @Override
    public void makeASignal() {
        System.out.println("If this fucker don't open my next transport will be Jesus");
    }
}