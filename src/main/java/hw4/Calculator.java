package hw4;

import java.security.PrivateKey;



public class Calculator {

    private double a;
    private double b;
    private double result;
    private String exception;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    public  double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        result = a / b;
        return result;
    }
}