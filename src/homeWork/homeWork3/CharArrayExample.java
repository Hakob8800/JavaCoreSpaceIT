package homeWork.homeWork3;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char ch = 'o';
        int countCh = 0;
        for (int i = 0; i < chars.length; i++) {
            if (ch == chars[i])
                countCh++;
        }
        System.out.println("Count of char 'o': " + countCh);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.println("Middle two elements: " + chars2[(chars2.length / 2) - 1] + ',' + chars2[chars2.length / 2]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = false;
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            b = true;
        }
        System.out.println("two last elements are 'l' and 'y': " + b);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);
        }
    }

}
