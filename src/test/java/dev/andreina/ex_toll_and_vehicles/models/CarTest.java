package dev.andreina.ex_toll_and_vehicles.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void testCalculateToll() {
        Vehicle car= new Car("GHT78945");
        assertEquals(100, car.calculateToll());
        }
    }
