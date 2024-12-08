package com.mmehul.dsa.DSALearning.math;

public class IsPrimeNumber {
	public void isPrimeNumber(int number) {
		int count = 0;
		for (int i = 1; i * i < number; i++) {
			if (number % i == 0) {
				count++;
				if ((number / i) != i)
					count++;
			}
		}

		if (count == 2) {
			System.out.printf("%d is primer number", number);
		} else {
			System.out.printf("%d is primer not number", number);
		}
	}

	public static void main(String[] args) {
		IsPrimeNumber object = new IsPrimeNumber();
		object.isPrimeNumber(5);
	}
}
