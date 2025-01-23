package dev.andreina.ex_toll_and_vehicles;

import dev.andreina.ex_toll_and_vehicles.models.Station;
import dev.andreina.ex_toll_and_vehicles.models.Vehicle;
import dev.andreina.ex_toll_and_vehicles.models.Car;
import dev.andreina.ex_toll_and_vehicles.models.Motorcycle;
import dev.andreina.ex_toll_and_vehicles.models.Truck;


/**
 * Hello world!
 */
public final class App {
    public App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Station station= new Station("Terminal", "Buenos Aires");

        Vehicle car1= new Car("XYG52689");
        Vehicle motorcycle1= new Motorcycle("PGR34754");
        Vehicle truck1= new Truck("HKJ98975", 2);

        station.registerVehicle(car1);
        station.registerVehicle(motorcycle1);
        station.registerVehicle(truck1);

        station.viewInformationToll();
    }
}
