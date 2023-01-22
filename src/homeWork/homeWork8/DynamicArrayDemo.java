package homeWork.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 12; i++) {
            dy.add(i + 1);
        }
        System.out.println(dy.length());
        dy.add(12, 1);
        dy.print();
        System.out.println(dy.exists(123));
        System.out.println(dy.exists(10));

    }

}
