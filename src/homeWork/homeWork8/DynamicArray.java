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
        if (index > size - 1 || index < 0) {
            System.out.println("Index " + index + " out of bounds");
            return -1;
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
        if (index > size - 1 || index < 0) {
            System.out.println("Index " + index + " out of bounds");
            return;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("There is not index" + index);
            return;
        }
        array[index] = value;
    }


    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Array only have " + size + " elements\n You can add index from 0 to "+size);
            return;
        }
        if (size == array.length) {
            extend();
        }
        size++;
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];

        }
        array[index] = value;

    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
