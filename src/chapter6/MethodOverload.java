package chapter6;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("square integer 7 is %d%n",square(7));
        System.out.printf("square double 7 is %d%n",square(7.5));
    }

    private static int square(int Value) {
        System.out.printf("%nCalled square with int argument: %d%n",Value);
        return Value * Value;
    }
    private static double square(double values) {
        System.out.printf("%nCalled square with double argument: %f%n",values);
        return values * values;
    }
}
