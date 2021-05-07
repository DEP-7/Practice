package dsdynamic;

public class DynamicArray {
    protected int[] array;

    public void add(int number) {
        add(size(), number);
    }

    public void add(int index, int number) {
        if (index < 0 || size() < index) {
            throw new RuntimeException("Invalid array index");
        }
        int[] temp = new int[size() + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index) {
                temp[i] = array[i];
            } else if (i == index) {
                temp[i] = number;
            } else {
                temp[i] = array[i - 1];
            }
        }
        array = temp;
    }

    public void remove(int index) {
        if (index < 0 || size() <= index) {
            throw new RuntimeException("Invalid array index");
        }
        if (size() == 1) {
            clear();
        } else {
            int[] temp = new int[size() - 1];
            for (int i = 0; i < temp.length; i++) {
                if (i < index) {
                    temp[i] = array[i];
                } else {
                    temp[i] = array[i + 1];
                }
            }
            array = temp;
        }
    }

    public int get(int index) {
        if (index < 0 || size() <= index) {
            throw new RuntimeException("Index not exist");
        }
        return array[index];
    }

    public boolean empty() {
        return array == null;
    }

    public void clear() {
        array = null;
    }

    public void print() {
        if (array == null) {
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
        if (array != null) {
            for (int numberInArray : array) {
                if (number == numberInArray) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return array == null ? 0 : array.length;
    }
}