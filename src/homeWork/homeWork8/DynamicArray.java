package homeWork.homeWork8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;


    public void add(int item) {
        if (size == array.length) {
            array = arrayLengthIncrement();
        }
        array[size++] = item;
    }

    public int get(int index) {
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private int[] arrayLengthIncrement() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    int length() {
        return size;
    }
}
