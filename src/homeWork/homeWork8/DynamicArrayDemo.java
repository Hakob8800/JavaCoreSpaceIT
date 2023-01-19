package homeWork.homeWork8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();


        for (int i = 0; i < 12; i++) {
            dy.add(i * 5);
        }

        dy.print();
        System.out.println(dy.length());
        dy.delete(6);
        dy.print();
        System.out.println(dy.length());
        System.out.println(dy.get(3));
        System.out.println(dy.get(13));
        System.out.println(dy.get(dy.length()-1));
    }

}
