package dss;

public class Stack {

    private int[] array;

    public void push(int number) {
        if (array == null || array.length == 0) {
            array = new int[1];
            array[0] = number;
        } else {
            int[] temp = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[temp.length - 1] = number;
            array = temp;
        }
    }

    public void pop() {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty. Can't pop");
        } else {
            int[] temp = new int[array.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public boolean empty() {
        return false;
    }

    public int peek() {
        return 0;
    }

    public void clear() {

    }

    public void print() {

    }

    public boolean contains(int number) {
        return false;
    }

    public int size() {
        return 0;
    }
}
