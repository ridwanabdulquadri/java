package chapter5;

public class SumForLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 20; i += 2) {
            total += i;
            System.out.printf("%d  ", total);
        }
    }
}
