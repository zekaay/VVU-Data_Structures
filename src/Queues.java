import java.util.*;

public class Queues {
    public static void main(String[] args)
    {
        //declare a Queue
        Queue<String> str_queue = new LinkedList<>();
        //initialize the queue with values
        System.out.println("REAL MADRID");
        System.out.println("------------------------------");
        str_queue.add("Zizou");
        str_queue.add("Courtois");
        str_queue.add("S.Ramos");
        str_queue.add("R. Varane");
        str_queue.add("Nacho");
        str_queue.add("F. Mendy");
        str_queue.add("F. Valverde");
        str_queue.add("T. Kroos");
        str_queue.add("L. Vasquez");
        str_queue.add("L. Modric");
        str_queue.add("Vinicius");
        str_queue.add("K. Benzema");

        //print the Queue
        System.out.println("This is the starting Eleven:\n" + str_queue);
        System.out.println("------------------------------");

        // the check the size of the queue
             System.out.println("Size of queue is :" + str_queue.size());
        System.out.println("------------------------------");

        // print head and deletes the head
        System.out.println("Queue's head: " + str_queue.remove());
        System.out.println("latest queue:\n" + str_queue);
        System.out.println("------------------------------");


        // To view the head of queue

        System.out.println("head of the latest queue-"
                +  str_queue.peek());

        // print queue
        System.out.println("Queue: " + str_queue);

        //print queue size again
        System.out.println("Size of queue is :" + str_queue.size());
        System.out.println("------------------------------");

        try {
            // Queue is empty now hence exception
            System.out.println("Queue's head: " + str_queue.element());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}