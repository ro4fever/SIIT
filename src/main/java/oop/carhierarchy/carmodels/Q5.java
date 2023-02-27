package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Audi;

public class Q5 extends Audi {

    public Q5(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[0];
        fuelTankSize = 75.0f;
        gearNum = gears[6];
        consumptionPer100kM = 8.3f;
        tyreSize = 20;
    }
}
