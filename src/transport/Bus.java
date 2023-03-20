package transport;

import java.util.List;

public class Bus extends Transport <DriverD> {
    private Size size;
    public Bus(String brand, String model, double engineVolume, DriverD driver, Size size, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics );
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getSize());
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void runCheckUp() throws TransportTypeException {

    }

    @Override
    public  void startMove(){
        System.out.println( "Автобус марки " + getBrand() + " начал движение" );
    }

    @Override
    public  void finishMove(){
        System.out.println( "Автобус марки " + getBrand() + " закончил движение" );
    }
    @Override
    public void pitStop() {
        System.out.println("Пит стоп у автобуса ");
    }
    @Override
    public void theBestTime() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время у автобуса" + maxSpeed);}
    @Override
    public void maxSpeed() { int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed);

    }
    @Override
    public  Type getType(){
        return Type.BUS;

    }

    @Override
    boolean passDiagnostics() throws TransportTypeException {
        return false;
    }
    @Override
    public boolean needGoDiagnostic () {
        return false;
    }


}
