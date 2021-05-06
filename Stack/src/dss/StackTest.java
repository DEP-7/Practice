package dss;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println("------------------------- Test null array - start");
        System.out.print("Array Items : ");
        stack.print();
        System.out.println("Array size = "+stack.size());
        System.out.println("peek = "+stack.peek());
        System.out.println("Is contains 10 --> "+stack.contains(10));
        System.out.println("Is empty : "+stack.empty());
        stack.pop();
        System.out.println("------------------------- Test null array - end");

        System.out.println("------------------------- Test push - start");
        System.out.print("Array Items : ");
        stack.print();
        stack.push(10);
        System.out.print("Array Items : ");
        stack.print();
        stack.push(20);
        System.out.print("Array Items : ");
        stack.print();
        stack.push(30);
        System.out.print("Array Items : ");
        stack.print();
        stack.push(40);
        System.out.print("Array Items : ");
        stack.print();
        stack.push(50);
        System.out.print("Array Items : ");
        stack.print();
        System.out.println("Array size = "+stack.size());
        System.out.println("peek = "+stack.peek());
        System.out.println("Is contains 5 --> "+stack.contains(5));
        System.out.println("Is contains 10 --> "+stack.contains(10));
        System.out.println("Is empty : "+stack.empty());
        System.out.println("------------------------- Test push - end");

        System.out.println("------------------------- Test pop - start");
        System.out.print("Array Items : ");
        stack.print();
        stack.pop();
        System.out.print("Array Items : ");
        stack.print();
        stack.pop();
        System.out.print("Array Items : ");
        stack.print();
        stack.pop();
        System.out.print("Array Items : ");
        stack.print();
        System.out.println("------------------------- Test pop - end");

        System.out.println("------------------------- Test length 0 array - start");
        System.out.print("Array Items : ");
        stack.print();
        stack.pop();
        System.out.print("Array Items : ");
        stack.print();
        stack.pop();
        System.out.print("Array Items : ");
        stack.print();
        System.out.println("Array size = "+stack.size());
        System.out.println("peek = "+stack.peek());
        System.out.println("Is contains 10 --> "+stack.contains(10));
        System.out.println("Is empty : "+stack.empty());
        stack.pop();
        System.out.println("------------------------- Test length 0 array - end");

        System.out.println("------------------------- Test clear() method - start");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.print("Array Items before clear : ");
        stack.print();
        stack.clear();
        System.out.print("Array Items after clear : ");
        stack.print();
        System.out.println("------------------------- Test clear() method - end");
    }
}
