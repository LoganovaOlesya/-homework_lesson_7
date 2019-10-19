package com.company;

public class Submarine extends TransportForWater{
    @Override
    public void move(int yards) {
        System.out.println("bulk-bulk");
        yards++;
    }

    @Override
    public void makeASignal() {
        System.out.println("make an ultrasound and we can't hear it");
    }

    public static class YellowSubmarine {
        public void makeASignal() {
            System.out.println("We are living in yellow submarine, yellow submarine, yellow submarine!");
        }
    }
}