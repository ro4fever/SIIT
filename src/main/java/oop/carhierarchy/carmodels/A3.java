package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Audi;

public class A3 extends Audi {

    public A3(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[1];
        fuelTankSize = 50.0f;
        gearNum = gears[6];
        consumptionPer100kM = 5.6f;
        tyreSize = 16;
    }
}
