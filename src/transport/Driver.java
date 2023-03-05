package transport;

public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int experience;

    public Driver(String name,
                  boolean driverLicense,
                  int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove();
    public abstract void finishMove ();
    public abstract void refuelTheCar();

}

