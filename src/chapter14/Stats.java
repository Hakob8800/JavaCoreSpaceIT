package chapter14;

public class Stats<T extends Number> {

    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
    boolean sameAvg(Stats<?> ob){
        return average() == ob.average();
    }
}
