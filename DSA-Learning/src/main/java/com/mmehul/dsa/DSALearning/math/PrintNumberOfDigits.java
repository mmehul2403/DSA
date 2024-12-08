package com.mmehul.dsa.DSALearning.math;

public class PrintNumberOfDigits {

	public void printNumberOfDigits(int digit) {
		int digitCount = 0;
		while (digit > 0) {
			digit = digit / 10;
			digitCount++;
		}
		System.out.println("Total number if digit is :" + digitCount);
	}

	public static void main(String[] args) {
		PrintNumberOfDigits obj = new PrintNumberOfDigits();
		obj.printNumberOfDigits(45876);
	}
}
