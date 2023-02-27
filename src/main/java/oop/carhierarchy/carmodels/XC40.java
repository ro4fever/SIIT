package oop.carhierarchy.carmodels;


import oop.carhierarchy.carmanufacturers.Volvo;

public class XC40 extends Volvo {

    public XC40(double inputFuel, String inputChassisNumber) {
        super(inputFuel, inputChassisNumber);

        fuelType = fuelTypes[4];
        fuelTankSize = 69.0f;
        gearNum = gears[6];
        consumptionPer100kM = 28f;
        tyreSize = 19;
    }
}