package Composition1;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private  int sheet;
    private int quilt;

    public Bed(String style,int pillows,int height,int sheet,int quilt){
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheet = sheet;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }
    public  String getStyle(){
        return  style;
    }
    public  int pillows(){
        return  pillows;
    }
    public int getHeight(){
        return height;
    }
    public int sheet(){
        return  sheet;
    }
    public int quilt(){
        return quilt;
    }
}
