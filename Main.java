package patterns.behavioral;

import patterns.behavioral.calculator.Calculator;
import patterns.behavioral.calculator.Complex;
import patterns.behavioral.calculator.ComplexCalculator;
import patterns.behavioral.logger.FileLogger;
import patterns.behavioral.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger("log.txt");
        Calculator calculator = new ComplexCalculator(logger);

        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, -1);

        // Выполнение операций и логирование результатов
        Complex sum = calculator.add(a, b);
        Complex product = calculator.multiply(a, b);
        Complex quotient = calculator.divide(a, b);

        // Вывод результатов
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
