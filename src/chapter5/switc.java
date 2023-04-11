package chapter5;

public class switc {
    public static void main(String[] args) {
        int total = 5;
        switch(total){
            case 5:
            case 6:
                System.out.println("five");
                break;
            default:
                System.out.println("different number");
        }
        int score = 0;
        if(score < 500){
            if (score < 20){
                System.out.println("i love my babe");
            }else
                System.out.println("i hate you");
        }
    }
}
