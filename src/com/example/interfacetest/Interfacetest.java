package com.example.interfacetest;

interface ElectronicDevices {

    void turnOn();
    void turnOff();
}

class Computer implements ElectronicDevices {

    @Override
    public void turnOn() {
        System.out.println("Computer turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer turned off");
    }

    void calculation() {
        System.out.println("Computer calculation");
    }
}

class Television implements ElectronicDevices {

    @Override
    public void turnOn() {
        System.out.println("Television turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off");
    }

    void watchingTv() {
        System.out.println("Watching tv");
    }
}

class AirConditioner implements ElectronicDevices {

    @Override
    public void turnOn() {
        System.out.println("Air conditioner turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("Air conditioner turned off");
    }

    void keppCool() {
        System.out.println("Air conditioner kepp cool");
    }
}



public class Interfacetest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Television television = new Television();
        AirConditioner airConditioner = new AirConditioner();

        computer.turnOn();
        computer.turnOff();
        computer.calculation();

        television.turnOn();
        television.turnOff();
        television.watchingTv();

        airConditioner.turnOn();
        airConditioner.turnOff();
        airConditioner.keppCool();
    }
}
