package transport;

import java.util.List;

public class Car extends Transport <DriverB> {
    private Bodytype bodytype;



    public Car(String brand, String model, double engineVolume, DriverB driver, Bodytype bodytype, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver, mechanic );
this.bodytype = bodytype;

    }
    public Bodytype getBodytype() {
        return bodytype;
    }

    public void setBodytype(Bodytype bodytype) {
        this.bodytype = bodytype;
    }

    @Override
    public void printType() {
        if (getBodytype() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodytype());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public  void startMove(){
        System.out.println( "Автомобиль марки " + getBrand() + " начал движение" );
    }

    @Override
    public  void finishMove(){
        System.out.println( "Автомобиль марки " + getBrand() + " закончил движение" );
    }
    @Override
    public void pitStop() {
        System.out.println("Пит стоп у машины ");
    }



    @Override
    public void theBestTime() {
        int minBound = 80;
        int maxBound = 120;
        int theBestSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
        System.out.println("Лучшая скорость у машины " + theBestSpeed);}

    @Override
   public void maxSpeed() {
        int minBound = 80;
            int maxBound = 120;
            int maxSpeed = (int)(minBound +  (maxBound - minBound) * Math.random());
            System.out.println("Максимальная скорость машины " + maxSpeed);
    }
    @Override
    public static boolean passDiagnostics() {
        {return isDiagnosticsPassed();}
    }

    @Override
    public  Type getType(){
        return Type.CAR;

    }
    @Override
    public boolean needGoDiagnostic () {
        return true;
    }

}













