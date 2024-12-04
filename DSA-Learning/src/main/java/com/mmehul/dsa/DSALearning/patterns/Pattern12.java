package com.mmehul.dsa.DSALearning.patterns;

/*
 * 
 E
 D E
 C D E
 B C D E
 A B C D E

 * 
 * */
public class Pattern12 {

	public void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			char currChar = (char) ('A' + (n - i));
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + currChar);
				currChar++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern12 pattern = new Pattern12();
		pattern.printPattern(26 );
	}
}
