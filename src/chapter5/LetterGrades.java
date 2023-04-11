package chapter5;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer grades in the range 0-100." +
                "\nType the end-of-file indicator to terminate input:"+
                "\nOn UNIX/Linux/macOS type <Ctrl> d then press Enter" +
                "\nOn Windows type <Ctrl> z then press Enter");
        while (scanner.hasNext()){
            int grade = scanner.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade/10){
                case 1:
                case 2:
                    ++aCount;
                    break;
                case 3:
                    ++bCount;
                    break;
                case 4:
                    ++cCount;
                    break;
                case 5:
                    ++dCount;
                    break;
                case 6:
                    ++eCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
        System.out.println("\nGrade Report");

        if(gradeCounter != 0){
            double average = (double) total/gradeCounter;

            System.out.printf("Class average is %.2f%n",average);
            System.out.printf("total is %d%n",total);
            System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","number of student who received each grade\n"+
                    "A: ",aCount,
                    "B: ",bCount,
                    "C: ",cCount,
                    "D: ",dCount,
                    "E: ",eCount,
                    "F: ",fCount);
        }else {
            System.out.println("\nGrade Report");
        }
    }
}
