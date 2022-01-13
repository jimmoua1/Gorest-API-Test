package demo.Assessment.TasksToDo10_Collection_Hash_and_Sets.KarasTasksToDo10_ProblemSolving.Problem_1;

import java.util.*;

public class Solution {

    Stack<Character> stack = new Stack<>();
    Queue<Character> que = new LinkedList<>();


   void pushCharacter(char ch){
        stack.push(ch);
    }
   void enqueueCharacter(char ch){
        que.add(ch);
    }

    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter(){
        return que.remove();
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input a Lowercase String:");
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
