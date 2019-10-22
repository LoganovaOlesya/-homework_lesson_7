package com.company;

public class Car extends TransportOnEarth {
    @Override
    public void move(int kilometers) {
        System.out.println("wrumm-wrumm");
        kilometers++;
    }

    @Override
    public void makeASignal() {
        System.out.println("beep-beep");
    }

    public static class Tesla extends Car {
        public void makeASignal() {
            System.out.println("I'm just like Elon Musk!");
        }
    }

    public static class DaewooMatiz extends Car {

    }
}