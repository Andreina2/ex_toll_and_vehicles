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





}
