//        Comparable                  VS                  Comparator
// ------------------------------------------------------------------------------------
//  1.  Single Sorting Sequence                       Multiple Sorting Sequence
//  2.  Affects the original Class                    Does not affect the original Class
//  3.    compareTo() method                                compare() method
//  4.   Collections.sort(List)                   Collections.sort(List, comparator)
//  5.  Only in "java.lang" package                   Only in "java.util" package

package demo.notes.collection.ComparableANDComparators.Comparable;

import java.util.ArrayList;
import java.util.Collections;

//    Collections.sort(List<T> list);
//             T stands for the "type" of the objects.
//       objects = integers, strings, char, float, etc.



class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    // compareTo - Student Age
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

    public static void main(String args[]){
        ArrayList<Student> students =new ArrayList<Student>();
        students.add(new Student(101,"Vijay",30));
        students.add(new Student(106,"Ajay",27));
        students.add(new Student(105,"Jai",21));

        Collections.sort(students);

        for(Student total : students){
            System.out.println("Roll Number: " + total.rollno + " | " +
                               "Name: " + total.name + " | " +
                               "Age: " + total.age);
        }
    }
}


