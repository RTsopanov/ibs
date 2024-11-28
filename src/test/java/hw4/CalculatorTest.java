package hw4;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {


    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "23, 3, 26", "-3, 4, 1"})
    public void add(double a, double b, double result) {
        assertEquals(result, calculator.add(a, b));
    }




    @ParameterizedTest
    @CsvSource({"1, 2, -1", "23, 3, 20", "-3, 4, -7"})
    public void subtract(double a, double b, double result) {
        assertEquals(result, calculator.subtract(a, b));
    }


    @ParameterizedTest
    @CsvSource({"1, 2, 2", "23, 3, 69", "-3, 4, -12"})
    public void multiply(double a, double b, double result) {
        assertEquals(result, calculator.multiply(a, b));
    }


    @ParameterizedTest
    @CsvSource({"94, 2, 47", "24, 3, 8", "164, 4, 41"})
    public void divide(double a, double b, double result) {
        assertEquals(result, calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"94, 0, ArithmeticException", "23, 0, ArithmeticException", "164, 0, ArithmeticException"})
    public  void divideByZero(double a, double b) {
        assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));

    }
}