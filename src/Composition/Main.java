package Composition;

import Composition1.*;
import Semicolon.Ceiling2;
import Semicolon.Cohort15;
import Semicolon.Inem;
import Semicolon.Legend;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2200B", "Dell", "240",dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer,", 27, new Resolution(2547, 7657));
        MotherBoard theMotherBoard = new MotherBoard("BJ-500", "Asus", 4, 6, "v2.4");
        PC thePc = new PC(theCase, theMonitor, theMotherBoard);
        thePc.powerUp();
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new  Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);
        Bedroom bedroom = new Bedroom("Tims",wall1,wall2,wall3,wall4,bed,lamp,ceiling);
        bedroom.makeBed();
        //bedroom.getLamp().turnOn();
        lamp.turnOn();

        Legend legend = new Legend("legend",12,"2hand");
        Inem inem = new Inem("2",14,"2");
        Ceiling2 ceiling2 = new Ceiling2(98,78);
        Cohort15 cohort15 = new Cohort15(ceiling2,legend,inem);
        legend.killRat();
        inem.playing();

    }
}
