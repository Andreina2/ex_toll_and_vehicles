package dev.andreina.ex_toll_and_vehicles.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StationTest {
    @Test
    void testCalculateToll() {
        Vehicle car = new Car("DGS78925");
        assertEquals(100, car.calculateToll());

    }

    @Test
    void testRegisterVehicle() {
        Station station= new Station("North", "Madrid");

        Vehicle car = new Car("SDT68799");
        Vehicle motorcycle = new Motorcycle("FDT98745");
        Vehicle truck = new Truck("HVB34476", 3);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        assertEquals(3, station.vehicleList.size());
        assertEquals(300, station.totalCollected);




    }

    @Test
    void testViewInformationToll() {
        Station station = new Station("Central", "Caracas");

        Vehicle car = new Car("SDT68799");
        Vehicle motorcycle = new Motorcycle("FDT98745");
        Vehicle truck = new Truck("HVB34476", 3);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        List<Vehicle> vehicles= station.vehicleList;

        assertEquals("SDT68799", vehicles.get(0).getPlate()); // get(0) es el indice 0 de la lista: que seria Car, y obtengo la placa
        assertEquals(100, vehicles.get(0).calculateToll()); // get(0) es el indice 0 de la lista: que seria Car, y obtengo el peaje
        
        assertEquals("FDT98745", vehicles.get(1).getPlate()); // get(1) es el indice 0 de la lista: que seria Motortcycle, y obtengo la placa
        assertEquals(50, vehicles.get(1).calculateToll()); // get(1) es el indice 0 de la lista: que seria Mototcycle, y obtengo el peaje

        assertEquals("HVB34476", vehicles.get(2).getPlate()); // get(2) es el indice 0 de la lista: que seria Truck, y obtengo la placa
        assertEquals(150, vehicles.get(2).calculateToll()); // get(2) es el indice 0 de la lista: que seria Truck, y obtengo el peaje


    }
}
