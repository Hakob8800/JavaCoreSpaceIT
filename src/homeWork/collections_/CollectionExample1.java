package homeWork.collections_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hendo");
        names.add("Vaxo");
        names.add("Sako");
        names.add("Karo");
        names.add("Mko");

        checkNameInList(names);
        deleteName(names);
        try {
            addByIndex(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You choose wrong index!");
        }
        System.out.println(names);

    }

    private static void checkNameInList(List<String> names) {
        System.out.println("Please input name for check.");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name + " is in list!");
        } else {
            System.out.println(name + " is not in list!");
        }
    }

    private static void deleteName(List<String> names) {
        System.out.println("Please input name for delete from list");
        String name = scanner.nextLine();
        if (!names.contains(name)) {
            System.out.println("there is not " + name);
        } else {
            names.remove(name);
            System.out.println(names);
        }
    }

    private static void addByIndex(List<String> names) throws ArrayIndexOutOfBoundsException {
        System.out.println("Please input index from range 0 to " + names.size());
        int index = Integer.parseInt(scanner.nextLine());
        if (index > names.size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("Please input name");
        String name = scanner.nextLine();
        names.add(index, name);
    }
}
