package chapter6;

public class Ridwan {
    public void slapAbdulmalik(String hand){
        slap(hand);
    }

    private void slap(String hand) {
        hand(hand);
    }

    private void hand(String hand) {
        System.out.printf("%s", "slap with my "+ hand);
    }

    public static void main(String[] args) {
        Ridwan head = new Ridwan();
        head.slapAbdulmalik("Right Hand");
    }
}
