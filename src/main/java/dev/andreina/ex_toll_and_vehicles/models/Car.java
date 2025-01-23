package dev.andreina.ex_toll_and_vehicles.models;

// extends : hereda atributos y metodos de clase vehicle
public class Car extends Vehicle {

    //constructor
    public Car (String plate) {
        super(plate); // super: llama el constructor de la clase padre: vehicle, el constructor vehicle debe aceptar el argumento plate:placa
    }

    @Override //@Override sobreescribe el metodo de la clase vehicle
    public double calculateToll() {
        return 100;
    }

}
