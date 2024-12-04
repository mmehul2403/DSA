package com.mmehul.dsa.DSALearning.patterns;

/*
 * 
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 0 1 0 1 0 1
 * 
 * */
public class Pattern5 {
	public void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			int digit = 1;
			if(i%2 ==0)
				digit = 0;
			
			for(int j=0;j<i;j++) {
				System.out.print(" " +digit);
				//flip the digit
				digit = 1 - digit;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern5 pattern = new Pattern5();
		pattern.printPattern(6);
	}
}
