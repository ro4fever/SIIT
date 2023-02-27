package oop.carhierarchy.vehicle;


import oop.carhierarchy.managecar.CarPrinter;

public abstract class Car implements Vehicle {

    CarPrinter print = new CarPrinter();

    protected float distance;

    protected float inputFloatDistance;

    public float availableFuel;

    public int tyreSize;

    protected final String chassisNumber;

    public final String[] fuelTypes = {"PETROL", "DIESEL", "LPG", "HYBRID", "ELECTRIC"};

    protected int[] gears = {0, 1, 2, 3, 4, 5, 6};

    protected int gearNum;

    public int gear;

    protected String fuelType;

    public String slogan;

    protected float fuelTankSize;

    protected float consumptionPer100kM;

    protected float averageFuelConsumption;

    protected float consumedFuel;

    protected float consumption;

    protected boolean carStarted;

    public Car(double inputFuel, String inputChassisNumber) {
        this.availableFuel = (float) inputFuel;
        this.chassisNumber = inputChassisNumber;
    }

    public float getAvailableFuel() {
        return this.availableFuel;
    }

    public float getConsumption() {
        return this.consumption;
    }

    public float getDistance() {
        return this.distance;
    }

    public float getInputFloatDistance() {
        return this.inputFloatDistance;
    }

    public int getGear() {
        return this.gear;
    }

    public void shiftGear(int inputGear) {
        if (inputGear <= this.gearNum && !(inputGear <= 0)) this.gear = inputGear;
        else {
            print.printWrongGear();
            this.gear = 0;
        }
    }

    public float getAverageFuelConsumption() {
        if (this.distance == 0) averageFuelConsumption = 0;
        else averageFuelConsumption = (this.consumption * 100) / this.distance;
        return averageFuelConsumption;
    }

    private void resetConsumptionStat() {
        this.distance = 0;
        this.consumption = 0;
    }

    public void start() {
        print.printStartConsumption(this);
        this.resetConsumptionStat();
        carStarted = true;
    }

    public void drive(double inputDistance) {
        if (carStarted && !(this.gear <= 0)) {
            inputFloatDistance = (float) inputDistance;
            this.distance += inputFloatDistance;
            consumedFuel = getActualConsumption(inputFloatDistance);

            if (consumedFuel > this.availableFuel) {
                print.printNotEnoughFuel(this);
            } else {
                print.printDrive(this);
                this.consumption += consumedFuel;
                this.availableFuel -= consumedFuel;
            }
        } else print.printNoStartNoGear();
    }

    public void stop() {

        if (!carStarted) print.printNotStarted();
        else {
            print.printStoppedConsumption(this);
            carStarted = false;
        }
    }

    private float getActualConsumption(float inputDistance) {
        return this.correctConsumptionByGear() * this.correctConsumptionByTyre() * inputDistance / 100 * this.consumptionPer100kM;
    }

    private float correctConsumptionByGear() {
        switch (this.gear) {
            case 1:
                return 1f;
            case 2:
                return 0.9f;
            case 3:
                return 0.8f;
            case 4:
                return 0.7f;
            case 5:
                return 0.6f;
            case 6:
                return 0.5f;
            default:
                return 0;
        }
    }

    private float correctConsumptionByTyre() {
        switch (this.tyreSize) {
            case 15:
                return 1;
            case 16:
                return 1.1f;
            case 17:
                return 1.2f;
            case 18:
                return 1.3f;
            case 19:
                return 1.4f;
            case 20:
                return 1.5f;
            default:
                return 0;
        }
    }
}
