package transport;

public abstract class Transport <T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private final double engineVolume;
private T driver;


    public Transport(String brand,
                     String model,
                     double engineVolume ,
                     T driver) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
            if (model == null || model.isEmpty()) {
                model = "default";
            }
            this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        setDriver(driver);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
     public abstract void startMove ();

    public abstract void finishMove ();
    @Override
    public String toString(){
        return "Марка: " + brand + " , "
                + "Модель: " + model + " , "
               + "объем двигателя: " + engineVolume;

    }
}

