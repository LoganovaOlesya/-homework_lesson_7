package com.company;

public class Airplane extends TransportOnAir {
    @Override
    public void move(int miles) {
        super.miles++;
    }

    @Override
    public void makeASignal() {
        System.out.println("I believe I can fly! I believe I can touch the sky!");
    }
}