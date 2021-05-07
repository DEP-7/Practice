import dsdynamic.DynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();

        dynamicArray.add(10);
        dynamicArray.print();
        dynamicArray.add(20);
        dynamicArray.print();
        dynamicArray.add(30);
        dynamicArray.print();

        dynamicArray.add(5,50);
        dynamicArray.print();
        dynamicArray.add(2,25);
        dynamicArray.print();
        dynamicArray.add(0,5);
        dynamicArray.print();
        dynamicArray.add(4,29);
        dynamicArray.print();

        dynamicArray.remove(2);
        dynamicArray.print();
        dynamicArray.remove(0);
        dynamicArray.print();

    }
}
