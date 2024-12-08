package com.mmehul.dsa.DSALearning.math;

public class PrintReverseDigits {

	public void printReverseDigits(int digits) {
		int reverseDigit = 0;
		while (digits > 0) {
			int digit = digits % 10;
			digits = digits / 10;
			reverseDigit = reverseDigit * 10 + digit;
		}
		System.out.println("Reverse digits are:" + reverseDigit);
	}

	public static void main(String[] args) {
		PrintReverseDigits obj = new PrintReverseDigits();
		obj.printReverseDigits(507);
	}
}
