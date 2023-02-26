package transport;

public class Car extends Transport <DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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

}













