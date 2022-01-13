package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_1_OOP_Intro_Class_Instances.Excercise_1_7;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getter
    public int getDay(){
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // setter
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        if(this.month <= 9 && this.day <= 9)
            return "0"+this.day+"/0"+this.month+"/"+this.year;
        else if(this.month <= 9){
            return this.day+"/0"+this.month+"/"+this.year;
        }
        else if(this.day <= 9){
            return "0"+this.day+"/"+this.month+"/"+this.year;
        }
        else{
            return this.day+"/"+this.month+"/"+this.year;
        }
    }
}
