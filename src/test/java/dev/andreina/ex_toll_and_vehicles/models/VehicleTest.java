package dev.andreina.ex_toll_and_vehicles.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void testCalculateToll() {
        Vehicle motorcycle = new Motorcycle("OPH78945");
        assertEquals(50, motorcycle.calculateToll());

    }

    @Test
    void testGetPlate() {
        Vehicle truck= new Truck("TGF85643", 4);
        assertEquals("TGF85643", truck.getPlate());

    }

    @Test
    void testSetPlate() {
        Vehicle car = new Car("KLM57943");
        car.setPlate("KLM58945");
        assertEquals("KLM58945", car.getPlate());


    }
}
