package chapter8;

public class Time1Main {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13,27,6);
        displayTime("After calling setTimes",time);
        try {
            time.setTime(99, 99, 99);
        }
            catch(IllegalArgumentException e) {
                System.out.printf("Exception: %s%n%n", e.getMessage());
            }
            displayTime("After time object is created", time);

        }
    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header,t.toUniversalString(),t.toString());
    }
}