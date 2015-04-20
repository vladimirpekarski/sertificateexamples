package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class SmplDeque {
    private Deque<String> splQ = new ArrayDeque<>();

    void addInQueue(String customer) {
        splQ.addLast(customer);
    }

    void removeFront() {
        splQ.removeFirst();
    }

    void removeBack() {
        splQ.removeLast();
    }

    void printQueue() {
        System.out.println("Special queue contains: " + splQ);
    }
}
