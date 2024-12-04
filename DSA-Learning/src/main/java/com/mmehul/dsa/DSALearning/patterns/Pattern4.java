package com.mmehul.dsa.DSALearning.patterns;

/**
 * 
 * *
 * *
 * * *
 * * * *
 * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 * 
 * */
public class Pattern4 {

	public void printPattern(int n) {
		for (int i = 0; i <= (2 * n) - 1; i++) {
			int printRow = i;
			// Change formula once hit the 5 rows
			if (printRow >= n) {
				printRow = ((2 * n) - i) - 1;
			}

			for (int j = 0; j <= printRow; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern4 Pattern = new Pattern4();
		Pattern.printPattern(5);
	}
}
