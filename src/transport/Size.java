package transport;

public enum Size {
    XS(0,10),
    S(11,25),
    M(26,50),
    L(51,80),
    XL(81,120);

    private double min;
    private double max;

    Size(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static Size getValue(int value) {
        for (Size e : Size.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e; }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Size{" +
                "min=" + min +
                ", max=" + max +
                '}' + super.toString();
    }
}

