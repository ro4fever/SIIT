package oop.carhierarchy.carmanufacturers;


import oop.carhierarchy.managecar.CarPrinter;
import oop.carhierarchy.vehicle.Car;

public abstract class Honda extends Car {

    CarPrinter print = new CarPrinter();

    public Honda(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        slogan = "Honda - The Power of Dreams";
        print.printSlogan(this);
    }
}