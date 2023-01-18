package homeWork.homeWork8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;


    public void add(int item) {
        if (size == array.length) {
            extend();
        }
        array[size++] = item;
    }

    public int get(int index) {
        if (index > array.length - 1 || index < 0) {
            System.err.println("Index out of bounds array ");
            return 0;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    int length() {
        return size;
    }

    public void delete(int index) {
        if (index > array.length - 1 || index < 0) {
            System.err.println("Index out of bounds array ");
            return;
        }
        for (int i = index; i < array.length; i++) {
            array[index] = array[index + 1];
        }
        size--;
    }
}
