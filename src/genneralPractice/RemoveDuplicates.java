package genneralPractice;


import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicate(nums);
        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicate(int[] nums){

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < nums.length; i++) {
            if (i<list.size()){
                nums[i] = list.get(i);
            }else {
                nums[i] = 0;
            }
        }
        return list.size();
    }

}
