package chapter3;

public class ClockMain {
    public static void main(String[] args) {
        Clock clock1 = new Clock(23,59,59);
        System.out.println("for hour is: " + clock1.getMinutes());
        System.out.println("for second is: " + clock1.getSecond());
        System.out.println("for hour is: "+ clock1.getHour());

    }
}
