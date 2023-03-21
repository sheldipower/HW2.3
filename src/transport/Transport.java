package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private T driver;
    private boolean diagnosticPassed;
    private List <Transport> carList;
     private List <Mechanic> mechanics;




    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver,
                     List <Mechanic> mechanics) {

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
        this.carList = carList;
        this.mechanics = mechanics;

    }

    public T getCarList() {
        return (T) carList;
    }

    public void setCarList(T carList) {
        this.carList = (List<Transport>) carList;
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

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void printType();

    public abstract  Type getType();



    public boolean isDiagnosticsPassed() {
        return diagnosticPassed;
    }
    public void setDiagnosticPassed(boolean diagnosticPassed) {
        this.diagnosticPassed = diagnosticPassed;
    }
    @Override
    public String toString() {
        return "Марка: " + brand + " , "
                + "Модель: " + model + " , "
                + "объем двигателя: " + engineVolume;

    }
    public abstract boolean  needGoDiagnostic ();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport transport =  (Transport) obj;

        return Objects.equals(brand,transport.brand)&& Objects.equals(model, transport.model) && Objects.equals(engineVolume, transport.engineVolume) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand,model,engineVolume,mechanics, driver);
    }
}



