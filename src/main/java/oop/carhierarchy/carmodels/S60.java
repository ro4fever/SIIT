package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Volvo;

public class S60 extends Volvo {

    public S60(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[1];
        fuelTankSize = 60.0f;
        gearNum = gears[6];
        consumptionPer100kM = 8.1f;
        tyreSize = 18;
    }
}