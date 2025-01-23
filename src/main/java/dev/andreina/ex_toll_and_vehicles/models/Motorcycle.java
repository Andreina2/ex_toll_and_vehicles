package dev.andreina.ex_toll_and_vehicles.models;

public class Motorcycle extends Vehicle{
    public Motorcycle (String plate) {
        super(plate);
    }

    @Override
    public double calculateToll() {
        return 50;
    }
    
}
