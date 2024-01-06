package com.mmehul.dsa.DSALearning.arrayproblems;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        int left = 0 , right = length -1;

        if(length <= 1)
            return;

        int breakPointIndex=-1;
        //Find Break point
        for(int i = length - 2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakPointIndex = i;
                break;
            }
        }

        if(breakPointIndex == -1){
            reverse(nums,0, length-1);
            return;
        }

        //Find next smallest int but bigger then nums[breakPointIndex]
        for(int j = length-1 ; j>breakPointIndex ;j--){
            if(nums[breakPointIndex] < nums[j]){
                //swape2 nums
                int temp = nums[breakPointIndex];
                nums[breakPointIndex] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        /*reverse an array from breakPointIndex to n-1 or if in case of last permutation go to the first perutation*/
        reverse(nums, breakPointIndex + 1, length-1);
    }

    static void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                System.out.print(",");
            System.out.print(nums[i]);
        }
    }
}
