package com.mmehul.dsa.DSALearning.math;

/*
 * Euclidean Extended algorithm
 * 
 * time complexity : O(log pie min(a,b))
 * 
 * */
public class GCDExtended {

	public void printGCD(int a, int b) {

		while (a > 0 && b > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}

		if (a == 0)
			System.out.println(b);
		else
			System.out.println(a);
	}

	public static void main(String[] args) {
		GCDExtended object = new GCDExtended();
		object.printGCD(20, 30);
		// object.printGCD(2046, 1057);
	}
}
