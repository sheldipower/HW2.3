
import transport.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD
                    ("driver №" + i,
                            true,
                            5 + i);
            Bus bus = new Bus(
                    "bus brand №" + i,
                    "bus model №" + i,
                    4.0,
                    driverD,
                    Size.XS);

            DriverB driverB = new DriverB
                    ("driver №" + i,
                            true,
                            5 + i);
            Car car = new Car(
                    "car brand №" + i,
                    "car model №" + i,
                    1.6,
                    driverB,
                    Bodytype.TYPE6);

            DriverC driverC = new DriverC
                    ("driver №" + i,
                            true,
                            5 + i);
            Truck truck = new Truck(
                    "truck brand №" + i,
                    "truck model №" + i,
                    4.5,
                    driverC,
                    LoadCapacity.N2);

            truck.setDiagnosticPassed(false);
            try { bus.passDiagnostics();
                car.passDiagnostics();
                truck.passDiagnostics();
            } catch (TransportTypeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }


        }
    }
}