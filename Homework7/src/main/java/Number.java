public abstract class Number {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public abstract boolean equals(Object obj);
}
