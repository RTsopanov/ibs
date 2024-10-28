package hw4;

import java.util.Scanner;

public class CalculatorApp {
    private Calculator calculator;
    private Scanner scanner;

    public CalculatorApp() {
        calculator = new Calculator();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            double a;
            double b;
            System.out.print("Введите первое число или exit для выхода: ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                a = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение");
                continue;
            }


            System.out.print("Введите второе число: ");
            String input2 = scanner.nextLine();
            try {
                b = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение");
                continue;
            }


            calculator.setA(Double.parseDouble(input1));
            calculator.setB(Double.parseDouble(scanner.nextLine()));


            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            try {
                switch (operation) {
                    case '+':
                        calculator.add(calculator.getA(), calculator.getB());
                        break;
                    case '-':
                        calculator.subtract(calculator.getA(), calculator.getB());
                        break;
                    case '*':
                        calculator.multiply(calculator.getA(), calculator.getB());
                        break;
                    case '/':
                        calculator.divide(calculator.getA(), calculator.getB());
                        break;
                    default:
                        throw new IllegalArgumentException("Неверная операция");
                }
                System.out.println("Результат: " + calculator.getResult());
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Операция невозможна: " + e.getMessage());
            }
        }
    }
}