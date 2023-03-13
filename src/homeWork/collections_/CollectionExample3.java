package homeWork.collections_;

import java.util.*;

public class CollectionExample3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("el");
        list.add("ty");
        list.add("se");
        Collections.sort(list, String::compareTo);
        String hi = "hi";
        int i = hi.codePointBefore(1);
        System.out.println(i);
    }
}
