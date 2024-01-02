package com.mmehul.dsa.DSALearning.general;

public class KaratsubaMultiplication {

    public static long multiplication(long x, long y){
        if(x<10 && y <10){
            return x*y;
        }

        // Get the length of X and Y
        int lengthX = numLength(x);
        int lengthY = numLength(y);

        //finding maximum number
        int maxLength = Math.max(lengthX, lengthY);

        //get half f length
        int halfMaxLength = (maxLength/2);
        long maxLengthDivider = (long) Math.pow(10,halfMaxLength);

        //Break the first and last half of number
        long a = x/maxLengthDivider; // (x's)first number left part
        long b = x%maxLengthDivider; // (x's)first number right part
        long c = y/maxLengthDivider; // (y's)first number left part
        long d = y%maxLengthDivider; // (y's)first number right part

        long ac = multiplication(a,c);
        long bd = multiplication(b,d);
        long ab_plus_cd  = multiplication(a+b,c+d);
        long abcd = ab_plus_cd - ac - bd;
        return (ac * (long)Math.pow(10,halfMaxLength*2) + abcd * (long)Math.pow(10,halfMaxLength) + bd);
    }

    // This method return length of the number
    private static int numLength(long num) {
        int length=0;

        while(num >0) {
            length++;
            num /= 10;
        }
        return length;
    }

    public static void main(String[] args) {

        //Example 1
        long expectedProduct = 1234 * 567814  ;
        long karatsubaProduct = multiplication(1234,567814);

        System.out.println("expectedProduct : "+expectedProduct + ", Karatsuba Result :"+karatsubaProduct);

        expectedProduct = 142536  * 458;
        karatsubaProduct = multiplication(142536 ,458);
        System.out.println("expectedProduct : "+expectedProduct + ", Karatsuba Result :"+karatsubaProduct);
    }
}
