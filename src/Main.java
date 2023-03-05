
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
                    driverD,
                    Size.XS);
            printInfo(bus);
            DriverB driverB = new DriverB
                    ("driver №" + i,
                            true,
                            5+i);
            Car car = new Car(
                    "car brand №" + i,
                    "car model №" + i,
                    1.6,
                    driverB,
                    Bodytype.TYPE6);
            printInfo(car);
            DriverC driverC = new DriverC
                    ("driver №" + i,
                            true,
                            5+i);
            Truck truck = new Truck(
                    "truck brand №" + i,
                    "truck model №" + i,
                    4.5,
                    driverC,
                    LoadCapacity.N2);
            printInfo(truck);
            truck.setDiagnosticPassed(false);
            try {
                (bus, truck, car);
            } catch (TransportTypeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

  public static checkTransport (Transport...transports) throws TransportTypeException {
            int count = 0;
            for (Transport transport : transports) {
                if (transport.passDiagnostics) {
                    count++;
                }
            }
            System.out.println("Диагностику прошли"+ count+ "из"+transports.length + "автомобилей");
        }
    }



    public static void printInfo(Transport <?> transport) {
        System.out.println(" водитель " + transport.getDriver().getName()+ " управляет автомобилем "  + transport.getBrand() + transport.getModel() +" и будет участвовать в заезде ");
    }



}
