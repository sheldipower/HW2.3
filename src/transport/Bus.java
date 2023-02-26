package transport;

public class Bus extends Transport <DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return super.toString();
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
}
