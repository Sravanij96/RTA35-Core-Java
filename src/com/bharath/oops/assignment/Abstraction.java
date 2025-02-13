package com.bharath.oops.assignment;

abstract class Car{
    abstract void startEngine();


}

class ElectricCar extends Car{

    @Override
    void startEngine() {
        System.out.println("Electric runs by electricity");
    }
}

class PetrolCar extends Car{

    @Override
    void startEngine() {
        System.out.println("Petrol car runs by petrol");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Car car;
         car = new ElectricCar();
        car.startEngine();

        car = new PetrolCar();
        car.startEngine();
    }
}
