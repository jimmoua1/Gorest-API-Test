// HackerRank Notes

package demo.notes.collection.Queues;

import java.util.LinkedList;

public class TestingQueus {

    LinkedList queue = new LinkedList();

    // Making a queue instance
    public TestingQueus(){
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
    public int dequeue(){
        return (int) queue.remove(0);
    }

    // Peek at the first item
    public int peek(){
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        TestingQueus numberQueue = new TestingQueus();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " +numberQueue.dequeue());
        System.out.println("Peeking next out: " +numberQueue.peek());
        System.out.println("Second out: " +numberQueue.dequeue());
        System.out.println("Third out: " +numberQueue.dequeue());
    }
}
