package com.mmehul.dsa.DSALearning.patterns;

/*
 A
 B B
 C C C
 D D D D
 E E E E E
 * */
public class Pattern9 {
	
	public void printPattern(int n) {
		char curruntChar = 'A';
		for(int i=0;i<n;i++) {
			for(int j =0; j<=i;j++) {
				System.out.print(" "+curruntChar);
			}
			curruntChar++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern9 pattern = new Pattern9();
		pattern.printPattern(5);	
	}
}
