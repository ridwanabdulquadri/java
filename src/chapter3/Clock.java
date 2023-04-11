package chapter3;

public class Clock {
    private int hour;
    private  int minutes;
    private  int second;

    public Clock(int hour, int minutes, int second) {
        if (hour > 23) {
            this.hour = hour;
            if(minutes > 59){
                this.minutes = minutes;
            }
            if(second > 59){
                this.second = second;
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23) {
            this.hour = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second > 59){
            this.second = 0;
            this.hour = 0;
        }
    }
    public void getdisplayFormat(){
        System.out.printf("hh:mm:ss",hour,second,minutes);
    }
}
