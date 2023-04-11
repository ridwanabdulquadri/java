package chapter6;

import java.security.SecureRandom;

public class RandomInteger {
    public static void main(String[] args) {
       SecureRandom randomNumbers = new SecureRandom();
        for (int counter = 0; counter <= 20 ; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ",face);

            if(counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
