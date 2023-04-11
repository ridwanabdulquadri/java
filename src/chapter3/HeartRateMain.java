package chapter3;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    HeartRate heartRates = new HeartRate();
    System.out.println("Enter First Name: ");
    String FirstName = scanner.nextLine();
    System.out.println("Enter Last Name: ");
    String lastName = scanner.nextLine();
    System.out.println("Enter Day: ");
    String Day = scanner.nextLine();
    System.out.println("Enter Month: ");
    String month = scanner.nextLine();
    System.out.println("Enter yearOfBirth: ");
    String yearOfBirth = scanner.nextLine();
    }
}
