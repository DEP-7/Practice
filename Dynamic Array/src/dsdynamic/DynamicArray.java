package dsdynamic;

public class DynamicArray {
    protected int[] array;

    public void add(int number) {
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

    public void add(int index, int number) {
        if (array == null || index < 0 || array.length <= index) {
            System.out.println("Index not exist");
        } else {
            int[] temp = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                temp[i] = array[i];
            }
            temp[index] = number;
            for (int i = index+1; i < temp.length; i++) {
                temp[i] = array[i-1];
            }
            array = temp;
        }
    }

    public void remove(int index) {
        if (array == null || array.length == 0) {
            System.out.println("Can't dequeue. Array is empty.");
        } else {
            int[] temp = new int[array.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i + 1];
            }
            array = temp;
        }
    }

    public void get(int index) {
        if (array == null || array.length == 0) {
            System.out.println("Can't dequeue. Array is empty.");
        } else {
            int[] temp = new int[array.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i + 1];
            }
            array = temp;
        }
    }

    public boolean empty() {
        return array == null || array.length == 0;
    }

    public void clear() {
        array = null;
    }

    public void print() {
        if (array == null || array.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int number : array) {
                System.out.print(number + ", ");
            }
            System.out.println("\b\b]");
        }
    }

    public boolean contains(int number) {
        if (array != null && array.length != 0) {
            for (int numberInArray : array) {
                if (number == numberInArray) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return array == null || array.length == 0 ? 0 : array.length;
    }
}
