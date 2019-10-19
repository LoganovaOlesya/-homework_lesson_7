package com.company;


public class Bycile extends TransportOnEarth {
    @Override
    public void move(int kilometers) {
        kilometers++;
    }

    @Override
    public void makeASignal() {
        System.out.println("Beeeep");
    }
}