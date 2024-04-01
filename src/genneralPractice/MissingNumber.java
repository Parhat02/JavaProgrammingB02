package genneralPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {

        int[]  nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNum(nums));
        System.out.println(missingNum2(nums));
        System.out.println(missingNum3(nums));
    }

    public static int missingNum(int[] nums){

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int totalSum = 0;
        for (int i = 0; i < nums.length+1; i++) {
            totalSum += i;
        }

        return totalSum - sum;
    }

    public static int missingNum2(int[] nums){

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int totalSum = (nums.length*(nums.length+1)/2);

        return totalSum - sum;
    }

    public static int missingNum3(int[] nums){

        int range = nums.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= range ; i++) {
            if (!set.contains(i)){
                return i;
            }
        }

        return 0;
    }

}
