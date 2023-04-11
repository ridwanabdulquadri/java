package chapter5;

public class Interest {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 0.05;
        System.out.println("Year" + "     Amount of Deposit");
        for (int year = 1; year <= 10; year++) {
            double amountInYear = principal * Math.pow(1.0 + rate,year);
            System.out.printf("%d%20.2f%n",year,amountInYear);
        }
    }
}
