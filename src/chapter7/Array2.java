package chapter7;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
            for (int j = 0; j < array.length; j++) {
                array[j] = array[j] * 10;
                System.out.printf("%d ", array[j]);
        }
    }
}
