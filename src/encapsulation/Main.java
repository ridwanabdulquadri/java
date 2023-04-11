package encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = ("ridwan");
//        player.health = 20;
//        player.weapon = ("Sword");
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health is " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Ridwan",220,"weapon");
        System.out.println("intial health is " + player.health());

    }
}
