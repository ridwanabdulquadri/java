package chapter7;

import java.util.Scanner;

public class Toy {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] number = getNumber(5);
        for (int i = 0; i < number.length; i++) {
            System.out.println("element " + i + ", type of " + number[i]);
            System.out.println("the average is " + getAverage(number));
        }

    }

    private static int[] getNumber(int num) {
        System.out.println("enter a number \n");
        int[] value = new int[num];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
        return (double) sum / (double) array.length;
    }
}
