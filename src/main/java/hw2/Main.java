package hw2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ruslan on 11.10.2024.
 *
 * @see #calc()
 * @see #findMaxLongestWordInArray()
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Выберите номер программу для запуска:\n1-Калькулятор\n2-Поиск слова в массиве");
        int num = scanner.nextInt();
        if (num == 1) {
            calc();
        } else findMaxLongestWordInArray();
    }


    public static void calc() {
        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();
        System.out.println("Выберите действие: +, -, *, /");
        char action = scanner.next().charAt(0);
        float result = 0f;

        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.printf("%.4f", result);
    }




    public static void findMaxLongestWordInArray() {
        int size = 0;
        System.out.println("Укажите длину массива: ");
        while (true) {
            try {
                size = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректный размер массива. Введите целое число. Повторите ввод.");
                scanner.nextLine();
            }
            if (size != 0) {
                break;
            }
        }


        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите слово: ");
            array[i] = scanner.next();
            if (size - i - 1 != 0) {
                if (size - i - 1 == 4 || size - i - 1 == 3 || size - i - 1 == 2) {
                    System.out.println("Осталось ввсети " + (size - i - 1) + " слова");
                } else if (size - i - 1 == 1) {
                    System.out.println("Осталось ввсети 1 слово.");
                } else {
                    System.out.println("Осталось ввсети " + (size - i - 1) + " слов");
                }
            } else
                System.out.println("Массив заполнен.");
        }


        String max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        System.out.println("Самое длинное слово: " + max);
    }
}
