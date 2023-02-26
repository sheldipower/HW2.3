
import transport.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD
                    ("driver №" + i,
                    true,
                    5+i);
            Bus bus = new Bus(
                    "bus brand №" + i,
                    "bus model №" + i,
                    4.0,
                    driverD);
            DriverB driverB = new DriverB
                    ("driver №" + i,
                            true,
                            5+i);
            Car car = new Car(
                    "car brand №" + i,
                    "car model №" + i,
                    1.6,
                    driverB);
            DriverC driverC = new DriverC
                    ("driver №" + i,
                            true,
                            5+i);
            Truck truck = new Truck(
                    "truck brand №" + i,
                    "truck model №" + i,
                    4.5,
                    driverC);
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }


    }

    public static void printInfo(Transport <?> transport) {
        System.out.println(" водитель " + transport.getDriver().getName()+ " управляет автомобилем "  + transport.getBrand() + transport.getModel() +" и будет участвовать в заезде ");
    }

}
