package dev.andreina.ex_toll_and_vehicles.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MotorcycleTest {
    @Test
    void testCalculateToll() {
        Vehicle motorcycle = new Motorcycle("TFH78655");
        assertEquals(50, motorcycle.calculateToll());

    }
}
