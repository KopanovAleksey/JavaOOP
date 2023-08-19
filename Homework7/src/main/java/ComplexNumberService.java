public class ComplexNumberService {
    ComplexOperations complexOperations = new ComplexOperations();
    public ComplexNumber createNumber(double realPart, double imaginaryPart){
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public Number Sum(Number n1, Number n2){
        return complexOperations.sum(n1, n2);
    }
    public Number Multiply(Number n1, Number n2){
        return complexOperations.multiplication(n1, n2);
    }
    public Number Divide(Number n1, Number n2){
        if (!n2.equals(new ComplexNumber(0,0))) return complexOperations.division(n1, n2);
        throw new RuntimeException("Zero division !");
    }


}
