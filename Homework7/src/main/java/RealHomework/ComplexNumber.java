package RealHomework;

import java.util.Objects;

public class ComplexNumber{
    private double Re;
    private double Im;

    public ComplexNumber(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }


    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", Re, Im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.Re, Re) == 0 && Double.compare(that.Im, Im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Re, Im);
    }

    public double getRe() {
        return Re;
    }

    public void setRe(double re) {
        Re = re;
    }

    public double getIm() {
        return Im;
    }

    public void setIm(double im) {
        Im = im;
    }

}
