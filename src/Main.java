
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Mechanic mechanic1 = new Mechanic("Зубров Дмитрий", "Самоделкин");
        Mechanic mechanic2 = new Mechanic("Константинов Илья", "Диагностикс");
        Mechanic mechanic3 = new Mechanic("Павлов Михаил", "Своя Компания");
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);

        DriverB driverB1 = new DriverB("Андрей Курпатов", true, 10);
        DriverB driverB2 = new DriverB("Алена Исмаилова", true, 3);
        DriverB driverB3 = new DriverB("Михаил Водянкин", true, 5);
        Car car1 = new Car("lada", "Granta", 1.5, driverB1, Bodytype.TYPE1, mechanics);
        Car car2 = new Car("Ford", "Focus", 1.7, driverB2, Bodytype.TYPE2, mechanics);
        Car car3 = new Car("Renault", "Daster", 1.5, driverB3, Bodytype.TYPE2, mechanics);
        DriverD driverD1 = new DriverD("Мясников Семен", true, 12);
        DriverD driverD2 = new DriverD("Морозов Игорь", true, 7);
        DriverD driverD3 = new DriverD("Меньшиков Исмаил", true, 2);
        Bus bus1 = new Bus("Hyudai", "H5320", 2.7, driverD1, Size.S, mechanics);
        Bus bus2 = new Bus("Mercedec", "Benz", 2.7, driverD2, Size.XS, mechanics);
        Bus bus3 = new Bus("Газель", "123", 2.7, driverD3, Size.S, mechanics);
        DriverC driverC1 = new DriverC("Александров Александр", true, 10);
        DriverC driverC2 = new DriverC("Семенов Илья", true, 40);
        DriverC driverC3 = new DriverC("Сидоров Константин", true, 7);

        Truck truck1 = new Truck("Kamaz", "6511", 3.0, driverC1, LoadCapacity.N1, mechanics);
        Truck truck2 = new Truck("Gaz", "3308", 3.0, driverC2, LoadCapacity.N3, mechanics);
        Truck truck3 = new Truck("Nefaz", "4514", 3.0, driverC3, LoadCapacity.N2, mechanics);

            List<Transport> carList = new ArrayList<>();
            carList.add(car1);
            carList.add(car2);
            carList.add(car3);
            carList.add(bus1);
            carList.add(bus2);
            carList.add(bus3);
            carList.add(truck1);
            carList.add(truck2);
            carList.add(truck3);

        Queue<ServiceStation> transportsQueue = new LinkedList<>();
        public void passDiagnostic() {
            transportsQueue.add(truck1);
            transportsQueue.add(truck2);
            transportsQueue.add(truck3);
            transportsQueue.add(bus1);
            transportsQueue.add(bus2);
            transportsQueue.add(bus3);
            transportsQueue.add(car1);
            transportsQueue.add(car2);
            transportsQueue.add(car3);

            Iterator<ServiceStation> iterator = transportsQueue.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }

        Truck.setDiagnosticPassed(false);
        try { Bus.passDiagnostics();
            Car.passDiagnostics();
            Truck.passDiagnostics();
        } catch (TransportTypeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());



        }
        }
        }









