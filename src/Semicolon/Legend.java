package Semicolon;

public class Legend {
    private String name;
    private int age;
    private String hand;

    public Legend(String name, int age, String hand) {
        this.name = name;
        this.age = age;
        this.hand = hand;
    }
    public void killRat(){
        System.out.println("killing rat");
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
