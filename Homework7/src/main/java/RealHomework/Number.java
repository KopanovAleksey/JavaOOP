package RealHomework;

public class Number extends ComplexNumber {

    public Number(double number) {
        super(number, 0);
    }

    public double getNumber() {
        return super.getRe();
    }

    public void setNumber(double number) {
        super.setRe(number);
    }

    @Override
    public String toString() {
        return String.format("%s", super.getRe());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
