package transport;

import java.util.List;

public class Truck extends Transport <DriverC> {
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity, List<Mechanic> mechasnics) {
        super(brand, model, engineVolume, driver, mechasnics );
this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getLoadCapacity());
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }



    @Override
    public void startMove(){
        System.out.println( "Грузовик марки " + getBrand() + " начал движение" );
    }

    @Override
    public  void finishMove(){
        System.out.println( "Грузовик марки " + getBrand() + " закончил движение" );
    }
    @Override
    public void pitStop() {
        System.out.println("Пит стоп у грузовика ");
    }
    @Override
    public void theBestTime() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время у грузовика " + maxSpeed);
    }
    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
        System.out.println("Махсимальная скорость грузовика" + maxSpeed);

    }


    @Override
    public  Type getType(){
        return Type.TRUCK;

    }
    @Override
    public boolean needGoDiagnostic () {
        return true;
    }
}

