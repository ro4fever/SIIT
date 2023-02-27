package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Honda;

public class Accord extends Honda {

    public Accord(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[3];
        fuelTankSize = 49.0f;
        gearNum = gears[6];
        consumptionPer100kM = 5.1f;
        tyreSize = 17;
    }
}