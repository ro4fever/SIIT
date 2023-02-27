package oop.carhierarchy.carmanufacturers;


import oop.carhierarchy.managecar.CarPrinter;
import oop.carhierarchy.vehicle.Car;

public abstract class Audi extends Car {

    CarPrinter print = new CarPrinter();

    public Audi(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        slogan = "Audi - Progress through Technology";
        print.printSlogan(this);
    }
}
