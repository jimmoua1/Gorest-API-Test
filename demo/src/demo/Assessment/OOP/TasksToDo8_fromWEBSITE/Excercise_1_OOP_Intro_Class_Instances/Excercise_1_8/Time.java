package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_8;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getter
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    // setter
    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        this.second += 1;
        if(this.second == 60){
            this.minute += 1;
            this.second = 0;
        }
        if (this.minute == 60){
            this.hour += 1;
            this.minute = 0;
        }
        if (this.hour == 24){
            this.hour = 0;
        }
        return this;
    }

    public Time previousSecond(){
        this.second --;
        if(this.second < 0){
            this.second = 59;
            this.minute --;
        }
        if(this.minute < 0){
            this.minute = 59;
            this.hour --;
        }
        if(this.hour < 0){
            this.hour = 23;
        }
        return this;
    }

    public String toString(){
        if(this.hour < 10 && this.minute < 10 && this.second < 10){
            return "0" + hour + ":" + "0" + minute + ":" + "0" + second;
        }
        return hour + ":" + minute + ":" + second;
    }

}
