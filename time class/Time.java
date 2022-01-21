public class Time {
    //Filed
    private int hour;
    private int minute;
    private int second;
    //Methods
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }
    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour ;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public Time nextSecond() {
        if (second == 59) {
            minute++;
            second = 0;

        } else if (second == 59 && minute == 59) {
            hour++;
            second = 0;
            minute = 0;
        } else if (hour == 24){
            hour=0;
            minute = 0;
            second = 0;
        }
        second ++;
        return nextSecond();
    }

    public Time previousSecond(){
        if(second == 0){
            minute--;
            second = 59;
        }
        if(minute == -1) {
            hour--;
            minute = 59;
        }
        else if(hour == -1){
         hour = 23;
        }
        else {
            second--;
        }

        return previousSecond();
    }



    public String toString(){
        return "Time :h " + hour +" :m " + minute + " :s " + second ;
    }


}
