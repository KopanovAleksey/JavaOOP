public class App {
    public static void main(String[] args) {
        ComplexNumberService cns = new ComplexNumberService();
        ComplexOperations cc = new ComplexOperations();
        ComplexNumber n1 = cns.createNumber(12, 13);
        ComplexNumber n2 = cns.createNumber(0, 0);
        System.out.println(cc.multiplication(n1, n2));
        System.out.println(cc.sum(n1, n2));
        System.out.println(cc.division(n1, n2));
    }
}
