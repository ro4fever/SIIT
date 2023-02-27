package oop.carhierarchy.managecar;


import oop.carhierarchy.vehicle.Car;

public class CarPrinter {

    public void printNotStarted() {
        System.out.println("The car wasn't started");
    }

    public void printWrongGear() {
        System.out.println("The input gear exceeds car Model limits or it is set to neutral \"0\".");
    }

    public void printNoStartNoGear() {
        System.out.println("The car wasn't started or the gear is set to neutral \"0\".");
    }

    public void printStartConsumption(Car car) {
        System.out.println("The car " + car.toString() + " is started with " + car.getAvailableFuel() + " liters available.");
    }

    public void printDrive(Car car) {
        System.out.println("The car " + car.toString() + " has been driven for " + car.getInputFloatDistance() + " km in the gear No. " + car.getGear());
    }

    public void printStoppedConsumption(Car car) {
        System.out.println("The car " + car.toString() + " has stopped with " + car.getConsumption() + " liters consumed for " + car.getDistance() + " km.");
    }

    public void printNotEnoughFuel(Car car) {
        System.out.println("Not enough fuel for " + car.getInputFloatDistance() + " km.");
    }

    public void printSlogan(Car car) {
        System.out.println(car.slogan);
    }

}
