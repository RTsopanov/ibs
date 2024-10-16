package hw4;

import java.util.Scanner;

public class CalculatorApp { private Calculator calculator;
    private Scanner scanner;

    public CalculatorApp() {
        calculator = new Calculator();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.print("Введите первое число или exit для выхода: ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Введите второе число: ");
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            try {
                double result;
                switch (operation) {
                    case '+':
                        result = calculator.add(num1, num2);
                        break;
                    case '-':
                        result = calculator.subtract(num1, num2);
                        break;
                    case '*':
                        result = calculator.multiply(num1, num2);
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Деление на ноль невозможно.");
                        }
                        result = calculator.divide(num1, num2);
                        break;

                    default:
                        throw new IllegalArgumentException("Неверная операция");

                }
                System.out.println("Результат: " + result);
            }catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Операция невозможна: " + e.getMessage());
            }
        }
    }
}