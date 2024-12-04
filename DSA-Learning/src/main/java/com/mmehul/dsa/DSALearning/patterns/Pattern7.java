package com.mmehul.dsa.DSALearning.patterns;

/*
 * 
 A
 A B
 A B C
 A B C D
 A B C D E

 */

public class Pattern7 {

	public void printPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (char c = 'A'; c <= ('A' + i); c++) {
				System.out.print(" " + c);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern7 pattern = new Pattern7();
		pattern.printPattern(5);
	}
}
