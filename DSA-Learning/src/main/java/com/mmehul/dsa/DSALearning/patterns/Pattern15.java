package com.mmehul.dsa.DSALearning.patterns;

/*
 * 
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
 *
 * */
public class Pattern15 {
	public void printPattern(int n) {
		int size = ((n * 2) - 1);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int top = i;
				int left = j;
				int bottom = size - 1 - i;
				int right = size - 1 - j;

				System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern15 pattern = new Pattern15();
		pattern.printPattern(4);
	}
}
