package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets.KarasTasksToDo10_ProblemSolving.Problem_6;
import java.util.*;


public class removeDuplicate {
    public static void charFreqMap(String string){

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < string.length(); i++){
            if(frequencyMap.get(string.charAt(i))==null){
                frequencyMap.put(string.charAt(i), 1);
            } else  {
                frequencyMap.put(string.charAt(i), frequencyMap.get(string.charAt(i)) + 1);
            }

        }
        for(int i = 0; i < string.length(); i++){
            if(frequencyMap.get(string.charAt(i)) > 0 ){
                System.out.print(string.charAt(i));
                frequencyMap.put(string.charAt(i), 0);
            }
        }

    }

    public static void main(String[] args) {
        charFreqMap("elephant");
        System.out.println();
        charFreqMap("geeksforgeeks");
    }
}
