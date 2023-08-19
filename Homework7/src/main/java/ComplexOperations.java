public class ComplexOperations implements Sum, Division, Multiplication{
    @Override
    public Number sum(Number n1, Number n2) {
        return new ComplexNumber(((ComplexNumber)n1).getRealPart() + ((ComplexNumber)n2).getRealPart(),
                ((ComplexNumber)n1).getImaginaryPart() + ((ComplexNumber)n2).getImaginaryPart());
    }

    @Override
    public Number multiplication(Number n1, Number n2) {
        return new ComplexNumber(((ComplexNumber)n1).getRealPart()*((ComplexNumber)n2).getRealPart() -
                ((ComplexNumber)n1).getImaginaryPart()* ((ComplexNumber)n2).getImaginaryPart(),
                ((ComplexNumber)n1).getRealPart()* ((ComplexNumber)n2).getImaginaryPart() +
                        ((ComplexNumber)n2).getRealPart()* ((ComplexNumber)n1).getImaginaryPart());
    }

    @Override
    public Number division(Number n1, Number n2) {
        return new ComplexNumber((((ComplexNumber)n1).getRealPart()*((ComplexNumber)n2).getRealPart() +
                ((ComplexNumber)n1).getImaginaryPart()* ((ComplexNumber)n2).getImaginaryPart())
                /(((ComplexNumber)n2).getRealPart()*((ComplexNumber)n2).getRealPart() +
                ((ComplexNumber)n2).getImaginaryPart()*((ComplexNumber)n2).getImaginaryPart()),
                (((ComplexNumber)n1).getImaginaryPart()* ((ComplexNumber)n2).getRealPart() -
                        ((ComplexNumber)n1).getRealPart()* ((ComplexNumber)n2).getImaginaryPart())
                        /(((ComplexNumber)n2).getRealPart()*((ComplexNumber)n2).getRealPart() +
                        ((ComplexNumber)n2).getImaginaryPart()*((ComplexNumber)n2).getImaginaryPart()));
    }
}
