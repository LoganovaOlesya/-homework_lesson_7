package com.company;

public class Moped extends TransportOnEarth{
    @Override
    public void move(int kilometers) {
        kilometers++;
    }

    @Override
    public void makeASignal() {
        System.out.println("Hi! I'm Obashen");
    }
}