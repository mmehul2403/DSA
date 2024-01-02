package com.mmehul.dsa.DSALearning.twopointer;

import java.util.Arrays;

public class ThreeSumClosest {

        public int threeSumClosest(int[] nums, int target) {
            int length = nums.length;
            int tempSum=0,sum=nums[0] + nums[1] + nums[length-1];
            Arrays.sort(nums);
            //TO iterate all the items
            for(int i=0;i<length;i++){
                //Set lower and highest pointer
                int j_pointer = i+1;
                int k_pointer = length-1;

                //iteration for sum
                while(j_pointer < k_pointer){
                    tempSum = nums[i] + nums[j_pointer] + nums[k_pointer];
                    //check the tempSum and increment or decriment the pointer
                    if(tempSum > target){
                        k_pointer--;
                    }else{
                        j_pointer ++;
                    }
                    if(Math.abs(tempSum-target) < Math.abs(sum-target)){
                        sum = tempSum;
                    }
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] arr = {-1,2,1,-4};
        int expectedResult = 2;
        int actualResult = obj.threeSumClosest(arr,4);
        if(expectedResult == actualResult){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}

