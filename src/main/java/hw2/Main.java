package hw2;

import java.sql.SQLOutput;
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
        String[] array = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "lemon", "mango", "orange"};
        String str = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i].length() > str.length()) {
                str = array[i];
            }
        }
        System.out.println(str);

    }


}
