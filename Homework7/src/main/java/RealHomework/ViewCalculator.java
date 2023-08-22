package RealHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    if(!arg.equals(new ComplexNumber(0, 0))) {
                        calculator.divide(arg);
                    }
                    else System.out.println("Деление на 0!");
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат %s\n", (Number)result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return ParseComplexNumber(in.nextLine());
    }
    ComplexNumber ParseComplexNumber(String ComplexNumber){
        if (ComplexNumber.isEmpty()) throw new IllegalArgumentException();
        StringBuilder buffer = new StringBuilder();
        String Re = "";
        String Im = "";
        char[] chars = ComplexNumber.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(i == 0 && chars[i] == '+') i++;
            if(chars[i] != '+' && chars[i] != '-'&& chars[i] != 'i' &&  chars[i] != ' ') buffer.append(chars[i]);
            else if(chars[i] == 'i') {
                Im = buffer.toString();
                buffer = new StringBuilder();
            }
            else if (chars[i] == '+'){
                Re = buffer.toString();
                buffer = new StringBuilder();
            }
            else if (chars[i] == '-'){
                Re = buffer.toString();
                buffer = new StringBuilder();
                buffer.append(chars[i]);
            }
        }
        if (!buffer.isEmpty()) Re = buffer.toString();
        double Real = Re.length() == 0 ? 0 : Double.parseDouble(Re);
        double Image =  Im.length() == 0 ? 0 :  Double.parseDouble(Im);
        return new ComplexNumber(Real, Image);
    }
}
