package chapter7;

import java.util.Scanner;

public class Read {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getArray(5);
        for (int i = 0; i < array.length; i++) {
        System.out.println("element " + i + ",of type " + array[i]);
    }
            System.out.println("average number" + getAverage(array));

    }

    private static int[] getArray(int number) {
        System.out.println("enter five integer: \r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();

        }
        return value;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i <  arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }
}
