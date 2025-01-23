package dev.andreina.ex_toll_and_vehicles.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    void testCalculateToll() {
        Vehicle truck = new Truck("BVL89065", 6);
        assertEquals(300, truck.calculateToll());

    }
}
