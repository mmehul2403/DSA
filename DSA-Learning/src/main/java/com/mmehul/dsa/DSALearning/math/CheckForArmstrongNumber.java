package com.mmehul.dsa.DSALearning.math;

public class CheckForArmstrongNumber {

	public boolean checkForArmstrongNumber(int number) {
		int sum = 0;
		int length = String.valueOf(number).length();
		int tempNumber = number;
		int digit;
		while (tempNumber > 0) {
			digit = tempNumber % 10;
			sum += Math.pow(digit, length);
			tempNumber /= 10;
		}

		return number == sum ? true : false;
	}

	public static void main(String[] args) {
		CheckForArmstrongNumber object = new CheckForArmstrongNumber();
		// System.out.println("371 is armstrong number :" +
		// object.checkForArmstrongNumber(371));

		int numberOfArmstrng = 25;
		int count = 0;
		int number = 1;
		long startTime = System.currentTimeMillis();

		while (count < numberOfArmstrng) {
			if (object.checkForArmstrongNumber(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}

		long endTime = System.currentTimeMillis();
		long elapaedTime = endTime - startTime;

		System.out.printf("Time taken to find first %d Armstrong number is %d", numberOfArmstrng, (elapaedTime / 1000));
	}
}
