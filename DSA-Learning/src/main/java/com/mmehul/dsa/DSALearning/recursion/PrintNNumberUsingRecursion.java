package com.mmehul.dsa.DSALearning.recursion;

public class PrintNNumberUsingRecursion {

	public void print(int n, int count) {
		if (count == n)
			return;
		System.out.println(count);
		count++;
		print(n, count);
	}

	public static void main(String[] args) {
		PrintNNumberUsingRecursion object = new PrintNNumberUsingRecursion();
		object.print(10, 1);

	}
}
