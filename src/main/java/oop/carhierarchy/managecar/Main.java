package oop.carhierarchy.managecar;


import oop.carhierarchy.carmodels.*;
import oop.carhierarchy.vehicle.Car;
import oop.carhierarchy.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

    Car AudiQ5 = new Q5(50, "WA1ANAFY3J2027136");

        AudiQ5.start();
        AudiQ5.shiftGear(1);
        AudiQ5.drive(0.01); // drives 0.01 KMs
        AudiQ5.shiftGear(2);
        AudiQ5.drive(0.02);
        AudiQ5.shiftGear(3);
        AudiQ5.drive(0.5);
        AudiQ5.shiftGear(4);
        AudiQ5.drive(0.5);
        AudiQ5.shiftGear(4);
        AudiQ5.drive(0.5);
        AudiQ5.shiftGear(5);
        AudiQ5.drive(10);
        AudiQ5.shiftGear(4);
        AudiQ5.drive(0.5);
        AudiQ5.shiftGear(3);
        AudiQ5.drive(0.1);
        AudiQ5.stop();
        float availableFuel = AudiQ5.getAvailableFuel();
        float fuelConsumedPer100Km = AudiQ5.getAverageFuelConsumption();

    Vehicle AudiA3 = new A3(30, "WAUZZZ8V9LA005288"); // available fuel and chassis number

        AudiA3.start();
        AudiA3.drive(1);
        AudiA3.stop();

        Car Audi_A3 = (Car) AudiA3;

        System.out.println(Audi_A3.getAvailableFuel());
        System.out.println(Audi_A3.getAverageFuelConsumption());


    Car HondaAccord = new Accord(36, "1HGCV1F31NA005121");

        HondaAccord.start();
        HondaAccord.shiftGear(1);
        HondaAccord.drive(0.01); // drives 0.01 KMs
        HondaAccord.shiftGear(2);
        HondaAccord.drive(0.02);
        HondaAccord.shiftGear(3);
        HondaAccord.drive(0.5);
        HondaAccord.shiftGear(4);
        HondaAccord.drive(0.5);
        HondaAccord.shiftGear(4);
        HondaAccord.drive(0.5);
        HondaAccord.shiftGear(5);
        HondaAccord.drive(10);
        HondaAccord.shiftGear(4);
        HondaAccord.drive(0.5);
        HondaAccord.shiftGear(3);
        HondaAccord.drive(0.1);
        HondaAccord.stop();

        System.out.println(HondaAccord.getAvailableFuel());
        System.out.println(HondaAccord.getAverageFuelConsumption());


    Car HondaCRV = new CRV(39, "5J6RW2H89NA004619");

        HondaCRV.start();
        HondaCRV.shiftGear(1);
        HondaCRV.drive(0.01); // drives 0.01 KMs
        HondaCRV.shiftGear(2);
        HondaCRV.drive(0.02);
        HondaCRV.shiftGear(3);
        HondaCRV.drive(0.5);
        HondaCRV.shiftGear(4);
        HondaCRV.drive(0.5);
        HondaCRV.shiftGear(4);
        HondaCRV.drive(0.5);
        HondaCRV.shiftGear(5);
        HondaCRV.drive(10);
        HondaCRV.shiftGear(4);
        HondaCRV.drive(0.5);
        HondaCRV.shiftGear(3);
        HondaCRV.drive(0.1);
        HondaCRV.stop();

        System.out.println(HondaCRV.getAvailableFuel());
        System.out.println(HondaCRV.getAverageFuelConsumption());


    Car VolvoS60 = new S60(58, "7JRA22TK3LG033773");

        VolvoS60.start();
        VolvoS60.shiftGear(1);
        VolvoS60.drive(0.01); // drives 0.01 KMs
        VolvoS60.shiftGear(2);
        VolvoS60.drive(0.02);
        VolvoS60.shiftGear(3);
        VolvoS60.drive(0.5);
        VolvoS60.shiftGear(4);
        VolvoS60.drive(0.5);
        VolvoS60.shiftGear(4);
        VolvoS60.drive(0.5);
        VolvoS60.shiftGear(5);
        VolvoS60.drive(10);
        VolvoS60.shiftGear(4);
        VolvoS60.drive(0.5);
        VolvoS60.shiftGear(3);
        VolvoS60.drive(0.1);
        VolvoS60.stop();

        System.out.println(VolvoS60.getAvailableFuel());
        System.out.println(VolvoS60.getAverageFuelConsumption());


    Car VolvoXC40 = new XC40(69, "7JRA22TK3LG033773");

        VolvoXC40.start();
        VolvoXC40.shiftGear(1);
        VolvoXC40.drive(0.01); // drives 0.01 KMs
        VolvoXC40.shiftGear(2);
        VolvoXC40.drive(0.02);
        VolvoXC40.shiftGear(3);
        VolvoXC40.drive(0.5);
        VolvoXC40.shiftGear(4);
        VolvoXC40.drive(0.5);
        VolvoXC40.shiftGear(4);
        VolvoXC40.drive(0.5);
        VolvoXC40.shiftGear(5);
        VolvoXC40.drive(10);
        VolvoXC40.shiftGear(4);
        VolvoXC40.drive(0.5);
        VolvoXC40.shiftGear(3);
        VolvoXC40.drive(0.1);
        VolvoXC40.stop();

        System.out.println(VolvoXC40.getAvailableFuel());
        System.out.println(VolvoXC40.getAverageFuelConsumption());
    }
}
