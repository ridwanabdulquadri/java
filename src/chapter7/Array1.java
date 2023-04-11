package chapter7;

public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[25];
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 10;
        }
        printArray(number);
    }
        public static void printArray(int[] array){
            for (int j = 0; j < array.length; j++) {
                System.out.println("element " + j + ",value is " + array[j]);
        }
    }
}
