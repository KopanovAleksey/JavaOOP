import java.util.Objects;

public class ComplexNumber extends Number{
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        super(realPart);
        this.imaginaryPart = imaginaryPart;
    }


    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", super.getNumber(), imaginaryPart);
    }

    public double getRealPart() {
        return super.getNumber();
    }

    public void setRealPart(double realPart) {
        super.setNumber(realPart);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.imaginaryPart, imaginaryPart) == 0;
    }
}
