// HackerRank Notes

package demo.notes.collection.Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class TestStack {

    LinkedList queue = new LinkedList();

    // Making a queue instance
    public TestStack(){
        queue = new LinkedList();
    }

    // Is our queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // Size of our Queue
    public int size(){
        return queue.size();
    }

    // Enqueuing an item
    public void enqueue(int n){
        queue.addLast(n);
    }

    // Dequeuing an item
    public String dequeue(){
        return (String) queue.remove(0);
    }

    // Peek at the first item
    public String peek(){
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");       // last one
        stacky.push("hi");          // LIFO - last in, first out
        System.out.println(stacky.pop() + " ");
        System.out.println(stacky.pop() + "! ");
        System.out.println("Size" + stacky.size());
    }
}
