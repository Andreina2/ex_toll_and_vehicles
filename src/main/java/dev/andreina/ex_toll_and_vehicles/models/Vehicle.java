package dev.andreina.ex_toll_and_vehicles.models;

abstract class Vehicle {
    private String plate;

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
    public abstract calculateToll();

}
