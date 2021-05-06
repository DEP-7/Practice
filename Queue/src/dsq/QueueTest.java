package dsq;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new Queue();
        System.out.println("------------------------- Test null array - start");
        System.out.print("Array Items : ");
        queue.print();
        System.out.println("Array size = "+queue.size());
        System.out.println("peek = "+queue.peek());
        System.out.println("Is contains 10 --> "+queue.contains(10));
        System.out.println("Is empty : "+queue.empty());
        queue.dequeue();
        System.out.println("------------------------- Test null array - end");

        System.out.println("------------------------- Test enqueue - start");
        System.out.print("Array Items : ");
        queue.print();
        queue.enqueue(10);
        System.out.print("Array Items : ");
        queue.print();
        queue.enqueue(20);
        System.out.print("Array Items : ");
        queue.print();
        queue.enqueue(30);
        System.out.print("Array Items : ");
        queue.print();
        queue.enqueue(40);
        System.out.print("Array Items : ");
        queue.print();
        queue.enqueue(50);
        System.out.print("Array Items : ");
        queue.print();
        System.out.println("Array size = "+queue.size());
        System.out.println("peek = "+queue.peek());
        System.out.println("Is contains 5 --> "+queue.contains(5));
        System.out.println("Is contains 10 --> "+queue.contains(10));
        System.out.println("Is empty : "+queue.empty());
        System.out.println("------------------------- Test enqueue - end");

        System.out.println("------------------------- Test dequeue - start");
        System.out.print("Array Items : ");
        queue.print();
        queue.dequeue();
        System.out.print("Array Items : ");
        queue.print();
        queue.dequeue();
        System.out.print("Array Items : ");
        queue.print();
        queue.dequeue();
        System.out.print("Array Items : ");
        queue.print();
        System.out.println("------------------------- Test dequeue - end");

        System.out.println("------------------------- Test length 0 array - start");
        System.out.print("Array Items : ");
        queue.print();
        queue.dequeue();
        System.out.print("Array Items : ");
        queue.print();
        queue.dequeue();
        System.out.print("Array Items : ");
        queue.print();
        System.out.println("Array size = "+queue.size());
        System.out.println("peek = "+queue.peek());
        System.out.println("Is contains 10 --> "+queue.contains(10));
        System.out.println("Is empty : "+queue.empty());
        queue.dequeue();
        System.out.println("------------------------- Test length 0 array - end");

        System.out.println("------------------------- Test clear() method - start");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.print("Array Items before clear : ");
        queue.print();
        queue.clear();
        System.out.print("Array Items after clear : ");
        queue.print();
        System.out.println("------------------------- Test clear() method - end");
    }
}
