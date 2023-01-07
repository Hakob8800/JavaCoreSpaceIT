package homeWork.homeWork4;

import java.util.Arrays;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', ' ', 'o', ' ', 'b', ' ', ' '};

        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') firstIndex++;
            if (spaceArray[i] != ' ') break;

        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') lastIndex--;
            if (spaceArray[i] != ' ') break;
        }

        char[] resultChars = new char[lastIndex - firstIndex + 1];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = spaceArray[firstIndex];
            firstIndex++;
        }

        for (char resultChar : resultChars) {
            System.out.print(resultChar);
        }
    }

}
