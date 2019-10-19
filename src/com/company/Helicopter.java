package com.company;

public class Helicopter extends TransportOnAir {
    @Override
    public void move(int miles) {
        super.miles++;
    }

    @Override
    public void makeASignal() {
        System.out.println("Look, I'm just like a James Bond");
    }
}