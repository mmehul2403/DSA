package com.mmehul.dsa.DSALearning.general;

public class ReverseInteger {

    public static int reverse(int x){
        int reverseNumber =0;
        int digit;

        while(x !=0){
            digit = x % 10;

            if(reverseNumber >= Integer.MIN_VALUE/10 && reverseNumber <= Integer.MAX_VALUE/10){
                reverseNumber = (reverseNumber * 10) +digit;
                x= x/10;
            }else{
                reverseNumber = 0;
                break;
            }
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE+" reverse is "+reverse(1463847412));
    }
}
