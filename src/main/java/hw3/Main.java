package hw3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        printArray();
        System.out.println();

        Candy candy = new Candy(120, 82, "Mars", "Bounty");
        Marmalade marmalade = new Marmalade(75, 42, 400, "Fruit-tella");
        Present present = new Present(candy, marmalade);
        System.out.println(present);


    }






    public static void printArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) - 10;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        int maxNum = 9;
        int indexMaxNum = array[0];
        int minNum = -9;
        int indexMinNum = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < maxNum) {
                maxNum = array[i];
                indexMaxNum = i;
            }
            else if(array[i] < 0 && array[i] > minNum) {
                minNum = array[i];
                indexMinNum = i;
            }
        }
        array[indexMaxNum] = minNum;
        array[indexMinNum] = maxNum;
        System.out.println(Arrays.toString(array));
            }



        }



