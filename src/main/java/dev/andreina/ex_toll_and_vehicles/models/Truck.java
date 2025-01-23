package dev.andreina.ex_toll_and_vehicles.models;

public class Truck extends Vehicle {
    private int numberOfAxles; //attribute
    
    //constructor
    public Truck(String plate, int numberOfAxles) {
        super(plate);
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double calculateToll() {
        return 50 *numberOfAxles; // multiplico 50 por cada eje
    }

    }

    



