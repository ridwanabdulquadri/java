package chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("enter first grade or -1 ");
        int grade = scanner.nextInt();

        while (grade != -1) {
            total = total +  grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("enter the next grade or -1");
            grade = scanner.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("%ntotal of  %d grades %d%n",gradeCounter,total);
//            System.out.printf("total grade %d%n",gradeCounter);
//            System.out.printf("total %d%n",total);
            System.out.printf("average %.2f%n", average);
        } else {
            System.out.println("No grade entered");
        }
        }
    }