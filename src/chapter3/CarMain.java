package chapter3;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("G-wagon", 2008, 25000.0);
        Car car2 = new Car("Porsche", 2022, 30000.0);
        System.out.println("G-wagon: " + car1.getPrice());
        System.out.println("Porsche: " + car2.getPrice());

        car1.setPrice(car1.getPrice() * 0.95);
        car2.setPrice(car2.getPrice() * 0.93);

        System.out.println("Price of G-wagon: " + car1.getPrice());
        System.out.println("Price of Porsche: " + car2.getPrice());


    }
}