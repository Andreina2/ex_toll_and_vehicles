package dev.andreina.ex_toll_and_vehicles.models;

import java.util.ArrayList;
import java.util.List;

public class Station {
    public String name;
    public String city;
    public double totalCollected;
    public List<Vehicle> vehicleList;


    // constructor
    public Station(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0.0;
        this.vehicleList = new ArrayList<>();
    }

    //method registerVehicle
    public void registerVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
        totalCollected += vehicle.calculateToll();
    }

    //method calculateToll
    public double calculateToll() {
        return totalCollected;
    }

    //method viewInformationToll
    public void viewInformationToll() {
    System.out.println("\n--- Information Toll ---");
    System.out.println("Registered vehicles:");

    //bucle for each para recorrer cada vehiculo de la lista vehicleList
    for (Vehicle vehicle : vehicleList){
        System.out.println("Plate:" + vehicle.getPlate() + ", Toll: $" + vehicle.calculateToll());
    }
    System.out.println("Total collected:" + totalCollected);
    }

}
