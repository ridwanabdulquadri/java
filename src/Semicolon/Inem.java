package Semicolon;

public class Inem {
    private String name;
    private int age;
    private String hand;

    public Inem(String name, int age, String hand) {
        this.name = name;
        this.age = age;
        this.hand = hand;
    }

    public void playing(){
        System.out.println("playing in the garden");
    }

    public Inem(String hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHand() {
        return hand;
    }
}
