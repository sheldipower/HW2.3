package transport;

public class DriverC extends Driver{
    public DriverC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водителю категории C " + getName() + " заправляет автомобиль");
    }
}
