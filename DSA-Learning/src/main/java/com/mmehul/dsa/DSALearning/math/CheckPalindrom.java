package com.mmehul.dsa.DSALearning.math;

import javax.sound.midi.Soundbank;

public class CheckPalindrom {
	public boolean checkPalindrom(int digits) {
		int tempDigits = digits;
		int reverseDigits = 0;
		int digit;

		while (tempDigits > 0) {
			digit = tempDigits % 10;
			reverseDigits = (reverseDigits * 10) + digit;
			tempDigits /= 10;
		}

		return reverseDigits == digits ? true : false;
	}

	public static void main(String[] args) {
		CheckPalindrom object = new CheckPalindrom();
		System.out.println("545 is palindrom: " + object.checkPalindrom(545));
	}
}
