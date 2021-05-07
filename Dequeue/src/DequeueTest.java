import dsdequeue.Dequeue;

public class DequeueTest {
    public static void main(String[] args) {
        Dequeue deque=new Dequeue();

        System.out.println("------------------------- Test enqueue - start");
        System.out.print("Enqueue - Array Items : ");
        deque.print();
        deque.enqueue(10);
        System.out.print("Enqueue - Array Items : ");
        deque.print();
        deque.enqueue(20);
        System.out.print("Enqueue - Array Items : ");
        deque.print();
        deque.enqueue(30);
        System.out.print("Enqueue - Array Items : ");
        deque.print();
        deque.enqueue(40);
        System.out.print("Enqueue - Array Items : ");
        deque.print();
        deque.enqueue(50);
        System.out.print("Enqueue - Array Items : ");
        deque.print();

        deque.enqueueRear(-10);
        System.out.print("Enqueue rear - Array Items : ");
        deque.print();
        deque.enqueueRear(-20);
        System.out.print("Enqueue rear - Array Items : ");
        deque.print();
        deque.enqueueRear(-30);
        System.out.print("Enqueue rear - Array Items : ");
        deque.print();

        System.out.println("Array size = "+deque.size());
        System.out.println("peek = "+deque.peek());
        System.out.println("Is contains 5 --> "+deque.contains(5));
        System.out.println("Is contains 10 --> "+deque.contains(10));
        System.out.println("Is empty : "+deque.empty());
        System.out.println("------------------------- Test enqueue - end");

        System.out.println("------------------------- Test dequeue - start");
        System.out.print("Dequeue - Array Items : ");
        deque.print();
        deque.dequeue();
        System.out.print("Dequeue - Array Items : ");
        deque.print();
        deque.dequeue();
        System.out.print("Dequeue - Array Items : ");
        deque.print();
        deque.dequeue();
        System.out.print("Dequeue - Array Items : ");
        deque.print();

        System.out.print("Current Array Items : ");
        deque.print();
        deque.dequeueFront();
        System.out.print("Dequeue Front - Array Items : ");
        deque.print();
        deque.dequeue();
        System.out.print("Dequeue Front - Array Items : ");
        deque.print();
        System.out.println("------------------------- Test dequeue - end");
    }
}
