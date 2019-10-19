package com.company;

public abstract class TransportOnEarth implements Main.transport{
    protected int kilometers = 0;
    @Override
    public abstract void move(int kilometers);

    @Override
    public abstract void makeASignal();
    }