package demo.notes.collection.IteratorClass;

import java.util.ArrayList;
import java.util.Iterator;

// All "Collections" can be iteratable because it extends from it
//    therefore 'iterate()' will always be available to be use
//   It is a quick-easy iterate for printing out index/elements

public class IteratorClass {
    public static void main(String[] args) {

        //Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Nissan");
        cars.add("Ferrari");
        cars.add("Toyota");

        Iterator<String> brand = cars.iterator();
        // While loop through the cars
        while (brand.hasNext()){
            System.out.println(brand.next());
        }
        // "forEach" loop works as well
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
