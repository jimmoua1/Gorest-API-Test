package demo.Assessment.TasksToDo9_Collection.HashMap_Excercises_12_Excercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapping {
    // 1. Write a Java program to associate the specified value with
    //    the specified key in a HashMap.
    public void HashMap1(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Associate specified value with the specified key
        for(Map.Entry title:movie.entrySet()){
            System.out.println(title.getKey() + " " +title.getValue());
        }
    }

    public void HashMap2(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // number of key-values -> Size
        movie.size();
        System.out.println("Size of the hash map is: " +movie.size());
    }

    public void HashMap3(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // copy all mappings from specified map to another map
        HashMap<Integer, String> movie2 = new HashMap<>();
        movie2.put(5, "Red Notice");
        movie2.put(6, "House of Gucci");
        movie2.put(7, "Ghostbuster: Afterlife");
        movie2.put(8, "Sing 2");
        movie2.putAll(movie);
        System.out.println(movie2); // will print in JSON format
    }

    public void HashMap4(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Remove all mappings from map
        movie.clear();
        System.out.println(movie);
    }

    public void HashMap5(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Check if empty (should be true)
        movie.isEmpty();
        System.out.println(movie.isEmpty());
    }

    public void HashMap6(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Copy shallow HashMap
        HashMap<Integer, String> sameMovies;

        movie.put(1, "Richard");
        sameMovies = (HashMap) movie.clone();
//        System.out.println(sameMovies);
        System.out.println("The clone of this: " + movie + " is equal to this: " + sameMovies.clone());
    }

    public void HashMap7(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Test if map contains a specific key
        movie.containsKey(1);
        System.out.println(movie.containsKey(1));
    }

    public void HashMap8(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Test if map contains a specific value
        movie.containsValue(2);
        System.out.println(movie.containsValue(1));
    }

    public void HashMap9(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Create a set view of the mappings contained in a map
        Set total = movie.entrySet();
        System.out.println("Set values: " +total);
    }

    public void HashMap10(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Get the value of a specified key in a map
        movie.get(4);
        System.out.println(movie.get(4));
    }

    public void HashMap11(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Get a set view of the keys contained in this map.
        Set resulted = movie.keySet();
        System.out.println(resulted);
    }

    public void HashMap12(){
        HashMap<Integer, String> movie = new HashMap<>();
        movie.put(1, "King Richard");
        movie.put(2, "Free Guy");
        movie.put(3, "Shang-Chi and the Legend of Ten Rings");
        movie.put(4, "Halloween Kills");

        // Get a Collection view of the values contained in this map.
        movie.values();
        System.out.println(movie.values());
    }

    public static void main(String[] args) {
        HashMapping test = new HashMapping();
        System.out.println("Question 1");
        System.out.println("-------------------------");
        test.HashMap1();
        System.out.println("-------------------------");
        System.out.println("Question 2");
        test.HashMap2();
        System.out.println("-------------------------");
        System.out.println("Question 3");
        test.HashMap3();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 4");
        test.HashMap4();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 5");
        test.HashMap5();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 6");
        test.HashMap6();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 7");
        test.HashMap7();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 8");
        test.HashMap8();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 9");
        test.HashMap9();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 10");
        test.HashMap10();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 11");
        test.HashMap11();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Question 12");
        test.HashMap12();
        System.out.println("-------------------------");
    }
}
