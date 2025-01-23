package dev.andreina.ex_toll_and_vehicles.models;

public abstract class Vehicle {
    private String plate;

    //constructor
    public Vehicle(String plate) {
        this.plate = plate;

    }
    
    //getter and setter
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    //method
    public abstract double calculateToll();

}
