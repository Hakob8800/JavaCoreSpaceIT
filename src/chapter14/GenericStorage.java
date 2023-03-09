package chapter14;

import java.util.Arrays;

public class GenericStorage<T> {
    private T[] arr;
    private int size;

    @SuppressWarnings("unchecked")
    GenericStorage() {
        arr = (T[]) new Object[10];
        size = 0;
    }

    public void add(T t) {
        if (size == arr.length) {
            extend();
        }
        arr[size++] = (T) t;
    }

    public T[] getElements(){
        return arr;
    }

    public int size(){
        return size;
    }

    public T getElement(int index){
        return arr[index];
    }

    private void extend() {
        arr = Arrays.copyOf(arr, arr.length + 10);
    }

}
