package chapter5;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do{
            System.out.printf("%d ",counter);
            counter++;
        }
        while (counter < 2);
        System.out.println();
    }
}
