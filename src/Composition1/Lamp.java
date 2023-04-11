package Composition1;

public class Lamp {
    private String Direction;
    private boolean battery;
    private int globeRating;

    public Lamp(String direction, boolean battery, int globeRating) {
        Direction = direction;
        this.battery = battery;
        this.globeRating = globeRating;
    }
    public  void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getDirection() {

        return Direction;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}
