package chapter4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
//        int studentGrade = 40;
//        if (studentGrade > 60) {
//            System.out.println("A");
//        } else {
//            System.out.println("B");
//            System.out.println("C");
//        } or
//        System.out.println(studentGrade < 45 ? "passed"  : "failed");
        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10) {
            System.out.println("enter grade");
            Scanner scanner = new Scanner(System.in);
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / 10;
        System.out.printf("total %n%d%n",total);
        System.out.printf("average %d%n",average);
    }
    }
