package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_5;

public class Customer {
    int ID;
    String name;
    char gender;

    public Customer(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender(char gender) {
        if(gender == 'f'){
            return "Female";
        }
        if(gender == 'm'){
            return "Male";
        }
        return "Please enter 'm'=male or 'f'=female";
    }

    public String toString() {
        return name + "(" + ID + ')';
    }
}
