package collections.queue.deque;

public class SplQueueTest {
    public static void main(String[] args) {
        SmplDeque splQ = new SmplDeque();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartey");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");

        splQ.printQueue();
        splQ.removeBack();
        splQ.removeFront();
        splQ.printQueue();
    }
}
