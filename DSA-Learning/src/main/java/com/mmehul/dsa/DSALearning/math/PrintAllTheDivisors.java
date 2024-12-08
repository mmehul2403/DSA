package com.mmehul.dsa.DSALearning.math;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintAllTheDivisors {
	public void printAllTheDivisors(int number) {
		List<Integer> listOfDivisors = new LinkedList<>();
		for (int i = 1; i * i < number; i++) {
			if (number % i == 0) {
				listOfDivisors.add(i);
				if (number / i != i)
					listOfDivisors.add(number / i);
			}
		}

		Collections.sort(listOfDivisors);
		Iterator<Integer> itr = listOfDivisors.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		PrintAllTheDivisors object = new PrintAllTheDivisors();
		object.printAllTheDivisors(36);
	}
}
