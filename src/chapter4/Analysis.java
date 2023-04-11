package chapter4;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while(studentCounter <= 10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter exam result");
            int examResult = scanner.nextInt();
            if(examResult == 1){
                passes = passes + 1;
            }else {
                failures = failures + 1;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("number of passes %d%n",passes);
        System.out.printf("number of failures %d%n",failures);
        if(passes > 8){
            System.out.println("bonus to instructor");
        }
}
}