package dev.andreina.ex_toll_and_vehicles.models;

class Motorcycle extends Vehicle{
    public Motorcycle (String plate) {
        super(plate);
    }

    @Override
    public double calculateToll() {
        return 50;
    }
    
}
