
import transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Андрей Курпатов", true, 10);
        Car car1 = new Car("lada", "Granta", 1.5, driverB1, Bodytype.TYPE1);
        List<Transport> Car = new ArrayList<>();
        Car.add(car1);

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