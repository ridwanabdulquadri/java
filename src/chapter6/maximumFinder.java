package chapter6;

import java.util.Scanner;

public class maximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter three number:\n");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();

        double result = maximum(number1,number2,number3,number4);

        System.out.println("result is " + result);
    }
    private static double maximum(double x, double y, double z,double k) {
         double maximumValue = x;

        if(y > maximumValue){
            maximumValue = y;
        }
        if(z > maximumValue){
            maximumValue = z;
        }
        if(k > maximumValue) {
            maximumValue = k;
        }
        return  maximumValue;
    }
}