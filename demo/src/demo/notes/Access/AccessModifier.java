package demo.notes.Access;

import demo.notes.Access.Main;
import demo.notes.Access.Test.*;

// If class is outside of the Package
//                  OR
//      "Private"  - cannot join in package
// but inside without "Public" will be fine

//-----------------------------------------------
// public, default, private

// public - any folder can access it
// default - any outside CANNOT access it
// private - any class in the folder CANNOT access it

//------------+-------+---------+--------------+--------------+--------
//        | Class | Package | Subclass     | Subclass     |Outside|
//        |       |         |(same package)|(diff package)|Class  |
//        ————————————+———————+—————————+——————————----+—————————----—+————————
//public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |
//        ————————————+———————+—————————+—————————----—+—————————----—+————————
//protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |
//        ————————————+———————+—————————+————————----——+————————----——+————————
//default     | Yes   |  Yes    |    Yes       |    No        |   No  |
//        ————————————+———————+—————————+————————----——+————————----——+————————
//private     | Yes   |  No     |    No        |    No        |   No  |
//        ------------+-------+---------+--------------+--------------+--------

// final - anything with this word, is CONSTANT(cannot be changed)

public class AccessModifier {
    static final String s = "test";

    public static void main(String[] args) {
        Main n = new Main();
        n.addition();
    }
}


