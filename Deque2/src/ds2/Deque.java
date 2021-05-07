package ds2;

import dsq.Queue;

public class Deque extends Queue {
    public void enqueueRear(int number) {
        if (array == null || array.length == 0) {
            array = new int[1];
            array[0] = number;
        } else {
            int[] temp = new int[array.length + 1];
            temp[0] = number;
            for (int i = 0; i < array.length; i++) {
                temp[i + 1] = array[i];
            }
            array = temp;
        }
    }

    public void dequeueFront() {
        if (array == null || array.length == 0) {
            System.out.println("Can't dequeue. Array is empty.");
        } else {
            int[] temp = new int[array.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }
}
