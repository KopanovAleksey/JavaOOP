package RealHomework;

public class CalculableFactory implements ICalculableFactory {

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }
}
