package Inheritance;

public class Fish extends Animal{
    private  int eyes;
    private  int grills;
    private int finns;

    public Fish(String name, int brain, int body, int size, int weight, int eyes, int grills, int finns) {
        super(name, 1000,20, size, weight);
        this.eyes = eyes;
        this.grills = grills;
        this.finns = finns;
    }
    public  void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
    public  void rest(){

    }
    public void moveBackFin(){
    }
    public void moveMuscles(){

    }
}
