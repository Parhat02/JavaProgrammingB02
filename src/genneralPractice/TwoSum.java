package genneralPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {16, 3, 11, 5, 15};

        System.out.println(Arrays.toString(twoSum(nums, 8)));
        System.out.println(Arrays.toString(twoSum2(nums, 8)));
    }
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i==j){
                    continue;
                }
                if (nums[i] + nums[j] == target){
                    result[0] = i; result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (numsMap.containsKey(result)){
                return new int[] {numsMap.get(result), i};
            }else {
                numsMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
