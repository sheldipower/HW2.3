package transport;

public enum LoadCapacity {
    N1(0,3.5),
    N2(3.5,12),
    N3(12,20);
    private double min;
    private double max;
    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    LoadCapacity() {

    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public static LoadCapacity getValue(double value) {
        for (LoadCapacity e : LoadCapacity.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "LoadCapacity{" +
                "min=" + min +
                ", max=" + max +
                '}' + super.toString();
    }
}
