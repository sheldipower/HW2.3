package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private T driver;
    private boolean diagnosticPassed;

    public boolean isDiagnosticPassed() {
        return diagnosticPassed;
    }

    public void setDiagnosticPassed(boolean diagnosticPassed) {
        this.diagnosticPassed = diagnosticPassed;
    }

    public Transport(String brand,
                     String model,
                     double engineVolume,
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

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void printType();

    public abstract Type getType();

    abstract boolean passDiagnostics() throws TransportTypeException;

    public boolean isDiagnosticsPassed() {
        return diagnosticPassed;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + " , "
                + "Модель: " + model + " , "
                + "объем двигателя: " + engineVolume;

    }

    public static void checkTransport(Transport... transports) throws TransportTypeException {
        int count = 0;
        for (Transport transport : transports) {
            if (transport.passDiagnostics()) {
                count++;
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<String>mechanic =  new ArrayList<String>();
        mechanic.add("Иванов Иван");
        mechanic.add("Галустян Петр");
        mechanic.add("Мария Макдалена");
        mechanic.add("Константин Забенский");

    }
}

