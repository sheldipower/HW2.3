package transport;

public class DriverD extends Driver{
    public DriverD(String name,
                   boolean driverLicense,
                   int experience) {
        super(name,driverLicense,experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водителю категории D " + getName() + " заправляет автомобиль");
    }
}
