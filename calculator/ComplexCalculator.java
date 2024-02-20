package patterns.behavioral.calculator;

import patterns.behavioral.logger.Logger;

public class ComplexCalculator implements Calculator{
    private final Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Complex add(Complex a, Complex b) {
        Complex result = a.add(b);
        logger.log("Addition result: " + result);
        return result;
    }

    @Override
    public Complex multiply(Complex a, Complex b) {
        Complex result = a.multiply(b);
        logger.log("Multiplication result: " + result);
        return result;
    }

    @Override
    public Complex divide(Complex a, Complex b) {
        Complex result = a.divide(b);
        logger.log("Division result: " + result);
        return result;
    }
}
