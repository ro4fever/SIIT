package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Honda;

public class CRV extends Honda {

    public CRV(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[2];
        fuelTankSize = 40.0f;
        gearNum = gears[6];
        consumptionPer100kM = 10.78f;
        tyreSize = 17;
    }
}