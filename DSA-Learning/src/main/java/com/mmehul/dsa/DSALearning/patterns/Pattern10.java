package com.mmehul.dsa.DSALearning.patterns;

/*
 A B C D E
 A B C D
 A B C
 A B
 A
 * */
public class Pattern10 {
	public void printPattern(int n) {
		for (int i = n; i >= 1; i--) {
			for (char c = 'A'; c < 'A' + i; c++) {
				System.out.print(" " + c);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern10 pattern = new Pattern10();
		pattern.printPattern(5);
	}
}
