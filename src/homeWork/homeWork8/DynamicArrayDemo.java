package homeWork.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 12; i++) {
            dy.add(i + 1);
        }
        dy.print();
        dy.add(0,11);
        dy.add(4,11);
        dy.print();
        System.out.println(dy.exists(4));
        System.out.println(dy.exists(44));
        System.out.println(dy.getIndexByValue(11));
        System.out.println(dy.getIndexByValue(-1));
    }

}
