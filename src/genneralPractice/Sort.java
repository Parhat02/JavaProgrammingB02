package genneralPractice;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 4, 2, 0, 6, 8, 7, 9, 1, 45};

        System.out.println(Arrays.toString(sorting(nums)));

        int[] numbers= {7,2,4,6,4,1,9,-1};

        System.out.println(Arrays.toString(selectionSort(numbers)));
        System.out.println(Arrays.toString(bubbleSort(numbers)));

    }

    public static int[] sorting(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }

    public static int[] selectionSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
        return nums;
    }

    public static int[] bubbleSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length-1; j++) {

                if (nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index2];
        nums[index2] = nums[index1];
        nums[index1] = temp;
    }

}
