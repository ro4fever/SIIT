package oop.carhierarchy.carmanufacturers;


import oop.carhierarchy.managecar.CarPrinter;
import oop.carhierarchy.vehicle.Car;

public abstract class Volvo extends Car {

    CarPrinter print = new CarPrinter();

    public Volvo(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        slogan = "Volvo. For life.";
        print.printSlogan(this);
    }
}
