package com.mmehul.dsa.DSALearning.patterns;

/*
 * 
    A    
   ABA   
  ABCBA  
 ABCDCBA
  
 * */
public class Pattern11 {

	public void printPattern(int n) {

		// Iterate through n rows
		for (int m = 0; m < n; m++) {

			// print space
			for (int i = 0; i < n - m - 1; i++) {
				System.out.print(" ");
			}

			// print char pattern
			char curruntChar = 'A';
			int breakpoint = (2 * m + 1);
			for (int j = 0; j <= (2 * m); j++) {
				System.out.print(curruntChar);
				if (j <= breakpoint) {
					curruntChar++;
				} else {
					curruntChar--;
				}
			}

			// print space
			for (int i = 0; i < n - m - 1; i++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern11 Pattern = new Pattern11();
		Pattern.printPattern(15);
	}
}
