
import transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Андрей Курпатов", true, 10);
        DriverB driverB2 = new DriverB("Алена Исмаилова", true, 3);
        DriverB driverB3 = new DriverB("Михаил Водянкин", true, 5);
        Car car1 = new Car("lada", "Granta", 1.5, driverB1, Bodytype.TYPE1);
        Car car2 = new Car("Ford", "Focus", 1.7, driverB2, Bodytype.TYPE2);
        Car car3 = new Car("Renault", "Daster", 1.5, driverB3, Bodytype.TYPE2);
        DriverD driverD1 = new DriverD("Мясников Семен", true, 12);
        DriverD driverD2 = new DriverD("Морозов Игорь", true, 7);
        DriverD driverD3 = new DriverD("Меньшиков Исмаил", true, 2);
        Bus bus1 = new Bus("Hyudai", "H5320", 2.7, driverD1, Size.S);
        Bus bus2 = new Bus("Mercedec", "Benz", 2.7, driverD2, Size.XS);
        Bus bus3 = new Bus("Газель", "123", 2.7, driverD3, Size.S);
        DriverC driverC1 = new DriverC("Александров Александр", true, 10);
        DriverC driverC2 = new DriverC("Семенов Илья", true, 40);
        DriverC driverC3 = new DriverC("Сидоров Константин", true, 7);
        Truck truck1 = new Truck("Kamaz", "6511", 3.0, driverC1, LoadCapacity.N1);
        Truck truck2 = new Truck("Gaz", "3308", 3.0, driverC2, LoadCapacity.N3);
        Truck truck3 = new Truck("Nefaz", "4514", 3.0, driverC3, LoadCapacity.N2);
        List<Transport> carList= new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(bus1);
        carList.add(bus2);
        carList.add(bus3);
        carList.add(truck1);
        carList.add(truck2);
        carList.add(truck3);

        Mechanic mechanic1 = new Mechanic( "Зубров Дмитрий", "Самоделкин");
        Mechanic mechanic2 = new Mechanic("Константинов Илья", "Диагностикс");
        Mechanic mechanic3 = new Mechanic("Павлов Михаил", "Своя Компания");
        List<Mechanic> mechanicList  = new ArrayList<>();
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
    }



    }




