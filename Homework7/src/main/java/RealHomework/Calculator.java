package RealHomework;

public class Calculator implements Calculable{
    private ComplexNumber primaryArg;

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        primaryArg.setRe(primaryArg.getRe() + arg.getRe());
        primaryArg.setIm(primaryArg.getIm() + arg.getIm());
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        primaryArg = new ComplexNumber((primaryArg).getRe()*(arg).getRe() - (primaryArg).getIm()* (arg).getIm(),
                (primaryArg).getRe()* (arg).getIm() + (arg).getRe()* (primaryArg).getIm());
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        primaryArg = new ComplexNumber((primaryArg.getRe() * arg.getRe() + primaryArg.getIm() * arg.getIm())
                / (arg.getRe() * arg.getRe() + arg.getIm() * arg.getIm()),
                (primaryArg.getIm() * arg.getRe() - primaryArg.getRe() * arg.getIm())
                        / (arg.getRe() * arg.getRe() + arg.getIm() * arg.getIm()));

        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
