package com.mmehul.dsa.DSALearning.patterns;

/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 * 
 * */

public class Pattern13 {

	public void printTopPattern(int n) {

		for (int i = 0; i < n; i++) {
			// pattern
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			// space
			for (int k = 0; k < (2 * i); k++) {
				System.out.print(" ");
			}
			// pattern
			for (int l = 0; l < (n - i); l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printBottomPattern(int n) {

		for (int i = 0; i < n; i++) {
			// pattern
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// space
			for (int k = 0; k < (2 * (n - (i + 1))); k++) {
				System.out.print(" ");
			}
			// pattern
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern13 pattern = new Pattern13();
		pattern.printTopPattern(5);
		pattern.printBottomPattern(5);
	}
}
