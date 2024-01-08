package com.mmehul.dsa.DSALearning.general;

public class ReverseInteger {

    public static int reverse(int x){
        long tempReverse=0;

        while(x !=0){
            tempReverse = (tempReverse * 10) + x%10;
            x= x/10;
            System.out.println("value of x :"+x);
        }

        if (tempReverse > Integer.MAX_VALUE || tempReverse < Integer.MIN_VALUE)
            return 0;
        else
            return (int)tempReverse;

    }

    public static void main(String[] args) {
        System.out.println(" reverse of -456 is "+reverse(-456));
    }
}
