package homeWork.homeWork5;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        ArrayUtilMethods util = new ArrayUtilMethods();
        int[] nums = {23, -34, 65, 4, 23, -56, 0, 67, -11};

        util.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(util.maxValueOfArray(nums));
        System.out.println(util.minValueOfArray(nums));
    }

}
