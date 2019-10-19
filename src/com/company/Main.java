package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public interface transport {
        void move(int steps);
        void makeASignal();
    }

    public static void main(String[] args) {

        Scanner saySomething = new Scanner(System.in);
        boolean isQuit = false;
        String message;

        Airplane airplane = new Airplane();
        Parachute parachute = new Parachute();
        Helicopter helicopter = new Helicopter();
        Boat boat = new Boat();
        Submarine submarine = new Submarine();
        Jesus jesus = new Jesus();
        Bycile bycile = new Bycile();
        Moped moped = new Moped();
        Car car = new Car();
        Car.Tesla = new Car.Tesla();


        System.out.println("Hey gorgeous wanna ride?" +
                "\nWrite 'airplane' if you wanna sing like Jim Kerry" +
                "\nWrite 'parachute' if you brave AF" +
                "\nWrite 'helicopter' if you like detective movies" +
                "\nWrite 'car' if you just wanna to go" +
                "\nWrite 'moped' if you wanna to go with fun" +
                "\nWrite 'bycicle' if you wanna make Oleg Tinkoff a little bit happier" +
                "\nWrite 'boat' if you rich" +
                "\nWrite 'submarine' if you sociopath (or like the beatles)" +
                "\nWrite 'jesus' if you don't have a money" +
                "\nWrite 'exit' if you tired");

        while (!isQuit) {
            System.out.print("> ");
            message = saySomething.nextLine();
            message = message.toLowerCase();

            switch (message) {
                case "airplane":
                    airplane.move(1);
                    airplane.makeASignal();
                    break;
                case "parachute":
                    parachute.move(4000);
                    parachute.makeASignal();
                    break;
                case "helicopter":
                    helicopter.move(1);
                    helicopter.makeASignal();
                    break;
                case "car":
                    car.move(1);
                    car.makeASignal();
                    break;
                case "moped":
                    moped.move(1);
                    moped.makeASignal();
                    break;
                case "boat":
                    boat.move(1);
                    boat.makeASignal();
                    break;
                case "submarine":
                    submarine.move(1);
                    submarine.makeASignal();
                    break;
                case "jesus":
                    jesus.move(1);
                    jesus.makeASignal();
                    break;
                case "exit":
                    isQuit = true;
                    break;
                default:
                    System.out.println("I don't know what you talking about. Try again");
                    break;
            }
        }
    }
}
