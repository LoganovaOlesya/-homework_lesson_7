package com.company;

public abstract class TransportOnAir implements Main.transport {
    protected int miles = 0;

    @Override
    public abstract void move(int kilometers);

    @Override
    public abstract void makeASignal();
    }