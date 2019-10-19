package com.company;

public abstract class TransportForWater implements Main.transport {
    @Override
    public abstract void move(int yards);

    @Override
    public abstract void makeASignal();
}