package genneralPractice;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 2, 0, 6, 8, 0, 9, 0, 45};

        System.out.println(Arrays.toString(moveZero(nums)));

    }

    public static int[] moveZero(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) continue;
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] != 0) break;
                swap(nums, i, k);
            }
        }
        return nums;
    }

    public static void swap(int[] ints, int index1, int index2){
        int temp = ints[index2];
        ints[index2] = ints[index1];
        ints[index1] = temp;
    }

//    public static void swap(int[] array, int index1, int index2){
//        int temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;
//    }

    public void moveZeroes(int[] nums) {
        if(nums.length==0){
            return;
        }
        int j=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }else{
                nums[j++] = nums[i];
            }
        }
        //int n = nums.length-count;
        for(int i=j;i<nums.length;i++){
            nums[j++] = 0;
        }

    }
}
