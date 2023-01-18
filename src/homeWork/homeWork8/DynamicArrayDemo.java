package homeWork.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 21; i++) {
            dy.add(i * 5);
        }

        dy.print();
        System.out.println(dy.length());
        System.out.println(dy.get(13));
        dy.delete(13);
        System.out.println(dy.get(13));
        dy.print();
        System.out.println(dy.length());
        dy.get(99);

    }

}
