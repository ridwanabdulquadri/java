package chapter5;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 10) {
            System.out.printf("%d%n",counter);
            ++counter;
        }
        System.out.println();
    }
}
