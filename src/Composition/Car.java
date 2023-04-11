package Composition;

public class Car extends Vechicle{
    private  int door;
    private int engineCapacity;
    public Car(int door,int engineCapacity,String name){
        super(name);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }
}
