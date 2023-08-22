package RealHomework;

public class LogCalculator implements Calculable{

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Calculable result = decorated.sum(arg);
        logger.log("Вызова метода sum произошел");
        return result;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Calculable result = decorated.multi(arg);
        logger.log("Вызова метода multi произошел");
        return result;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода divide с параметром %s", firstArg, arg));
        Calculable result = decorated.divide(arg);
        logger.log("Вызова метода divide произошел");
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}
