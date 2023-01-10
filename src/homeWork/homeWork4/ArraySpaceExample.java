package homeWork.homeWork4;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', ' ', 'B', ' ', 'o', ' ', 'b', ' ', ' ', ' '};

        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') firstIndex++;
            else break;

        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') lastIndex--;
            else break;
        }

        char[] resultChars = new char[lastIndex - firstIndex + 1];
        for (char ch : resultChars) {
            ch = spaceArray[firstIndex++];
            System.out.print(ch);
        }

    }

}
