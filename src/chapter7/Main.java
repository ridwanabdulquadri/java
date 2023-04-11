package chapter7;

import chapter7.Hamburger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("white","Sausage","Basic", 3.56);
        double price = hamburger.itemizeHamburger();
    }
}
