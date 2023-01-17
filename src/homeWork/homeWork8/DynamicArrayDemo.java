package homeWork.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 35; i++) {
            dy.add(i * 5);
        }

        dy.print();
        System.out.println(dy.get(11));
        System.out.println(dy.length());

    }

}
