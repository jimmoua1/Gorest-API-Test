package demo.notes.collection.Queues;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * QUEUE's
 *
 * methods: QUEUE
 *      ADD to tail
 *      .add()
 *      .offer()
 *
 *      GET the head
 *      .element()
 *      .peek()
 *      .poll()
 *      .remove()
 *
 * methods: java.util.Collections
 *      .addAll()
 *      .clear()
 *      .contains()
 *      .containsAll(),
 *      .equals(),
 *      .hashCode(),
 *      .isEmpty(),
 *      .iterator(),
 *      .parallelStream(),
 *      .remove(),
 *      .removeAll(),
 *      .removeIf(),
 *      .retainAll(),
 *      .size(),
 *      .spliterator(),
 *      .stream(),
 *      .toArray(),
 *
 * methods: java.lang.Iterable
 *      forEach
 */

public class QueuesNotes {

//    head [2, 3, 4, 5] tail

    public static void main(String[] args) {

        // create queue
        Queue<String> lunchLine = new LinkedList<>();
        Queue<String> emptyQueue = new LinkedList<>();
        Queue<Integer> fullQueue = new PriorityQueue<>(1);

        fullQueue.add(1);
        fullQueue.add(2);
        fullQueue.add(3);

        // create stuff to go in queue
        String[] people1 = {"Billy", "Jen"};
        String[] people2 = {"Randy", "Tracy"};

        /**
         * ADD to queue
         *
         * methods: QUEUE
         *
         *    ADD
         *      .add():   add 1 object if there's room.
         *                Returns boolean.
         *                True=success.
         *                False=no available space, "IllegalStateException".
         *
         *      .offer(): add 1 Object if there's room.
         *                Returns boolean.
         *                True=success.
         *                False=unsuccessful.
         *
         * methods: java.util.Collections
         *      .addAll()
         *
         */
        // .add()   <queue>.add(<Object>);
        lunchLine.add(people1[0]);
        printQue(lunchLine, "lunchLine");
        printQue(fullQueue, "fullQueue");
//        try {
//            System.out.println((fullQueue.add(5)));
//        } catch (IllegalStateException error) {
//            printCode("fullQueue.add(5)", "ERROR: " + error);
//        }
//        printQue(fullQueue, "fullQueue");
//        try {
//            System.out.println(fullQueue.add(6));
//        } catch (IllegalStateException error) {
//            printCode("fullQueue.add(6)", "ERROR: " + error);
//        }
        printQue(fullQueue, "fullQueue");

        // .offer()     <queue>.offer(<Object>);
        lunchLine.offer(people1[1]);
        printQue(lunchLine, "lunchLine");
        fullQueue.offer(5);

        /* .addAll()    <queue>.addAll(<List Object>); */
        lunchLine.addAll(List.of(people2));
        printQue(lunchLine, "lunchLine");

        /**
         *  GET from queue
         *
         * methods:
         *     *DON'T REMOVE*
         *      peek():    Get next Object, DON'T remove it.
         *                 Return: 'null' if queue is empty.
         *      element(): Get next Object, DON'T remove it
         *                 Throws: "NoSuchElementException" if queue empty.
         *
         *     *REMOVE*
         *      poll():    Get next Object, remove it from queue.
         *                 Return 'null' if queue is empty.
         *      remove():  Get next Object, remove it from queue.
         *                 Throws: "NoSuchElementException" if queue empty.
         */
        // peek():
        header("GET: .peek()");
        printQue(lunchLine, "lunchLine, queue with people");
        printCode("lunchLine.peek()",lunchLine.peek());
        printQue(emptyQueue, "emptyQueue");
        printCode("emptyQueue.peek()",emptyQueue.peek());
        printQue(fullQueue, "fullQueue");
        printCode("fullQueue.peek()",fullQueue.peek());

        header("GET: .element()");
        printQue(lunchLine, "lunchLine, queue with people");
        printCode("lunchLine.element()",lunchLine.element());
        printQue(emptyQueue, "emptyQueue");
        try {
            printCode("emptyQueue.element()",emptyQueue.element());
        } catch (NoSuchElementException error) {
            printCode("emptyQueue.element()", "ERROR: " + error);
        }
        printQue(fullQueue, "fullQueue");
        printCode("fullQueue.element()",fullQueue.element());

        header("GET: .poll()");
        printQue(lunchLine, "lunchLine, queue with people");
        printCode("lunchLine.poll()",lunchLine.poll());
        printQue(emptyQueue, "emptyQueue");
        printCode("emptyQueue.poll()",emptyQueue.poll());
        printQue(fullQueue, "fullQueue");
        printCode("fullQueue.poll()",fullQueue.poll());

        header("GET: .remove()");
        printQue(lunchLine, "lunchLine, queue with people");
        printCode("lunchLine.remove()",lunchLine.remove());
        printQue(emptyQueue, "emptyQueue");
        try {
            printCode("emptyQueue.remove()", emptyQueue.remove());
        } catch (NoSuchElementException error) {
            printCode("emptyQueue.remove()", "ERROR: " + error);
        }
        printQue(fullQueue, "fullQueue");
        printCode("fullQueue.remove()",fullQueue.remove());


        // do stuff with queue


    }

    // BACKGROUND COLORS - ansi
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    // FOREGROUND COLORS - ansi
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void printCode(String code, Object output) {
        System.out.println(
                "INPUT:\n" + GREEN + code + COLOR_RESET +
                "\nOUTPUT:\n" + GREEN + output + COLOR_RESET + "\n"
        );
    }

    public static void printQue(Queue queue, String title) {
        System.out.println(
                "Queue: "+title+'\n'+CYAN+queue+COLOR_RESET
        );
    }

    public static void header(String title) {
        System.out.println("\n***************\n\n .:: " + title + " ::.\n");
    }
}

