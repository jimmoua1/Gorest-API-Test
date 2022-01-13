//                  Comparable                  VS                  Comparator
//        ------------------------------------------------------------------------------------
// 1.  Single Sorting Sequence                       Multiple Sorting Sequence
// 2.  Affects the original Class                    Does not affect the original Class
// 3.    compareTo() method                                compare() method
// 4.   Collections.sort(List)                   Collections.sort(List, comparator)
// 5.  Only in "java.lang" package                   Only in "java.util" package

package demo.notes.collection.ComparableANDComparators.Comparator;

import java.util.*;

class TestComparator {
    public static void main(String args[]) {
        //Creating a list of students
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
//-----------------------------------------------------------------------------
        System.out.println("Sorting by Name");

        // Using NameComparator to sort the elements
        Collections.sort(al, new NameComparator());

        // Iterate the Array List for Name in order
        for (Student st : al) {
            System.out.println("Roll Number: " + st.rollno + " | " +
                    "Name: " + st.name + " | " +
                    "Age: " + st.age);
        }

        System.out.println("");
//-----------------------------------------------------------------------------
        System.out.println("sorting by Age");

        //Using AgeComparator to sort the elements
        Collections.sort(al, new AgeComparator());

        // Iterate the Array List again for Age in order
        for (Student st : al) {
            System.out.println("Roll Number: " + st.rollno + " | " +
                    "Name: " + st.name + " | " +
                    "Age: " + st.age);
        }
    }
}
