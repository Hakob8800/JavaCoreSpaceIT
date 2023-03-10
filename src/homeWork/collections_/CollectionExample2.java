package homeWork.collections_;

import java.util.*;

public class CollectionExample2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please input name");
            names.add(scanner.nextLine());
        }
        System.out.println(names);

        Set<String> names2 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("input name");
            names2.add(scanner.nextLine());
        }
        System.out.println(names2);
    }
}
