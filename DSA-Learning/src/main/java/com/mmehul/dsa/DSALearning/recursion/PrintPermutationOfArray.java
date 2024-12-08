package com.mmehul.dsa.DSALearning.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutationOfArray {

	static void getAllPermutation(int[] nums, List<List<Integer>> result, List<Integer> ds, boolean[] isTaken) {
		if (ds.size() == nums.length) {
			result.add(new ArrayList<>(ds));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!isTaken[i]) {
				ds.add(nums[i]);
				isTaken[i] = true;
				getAllPermutation(nums, result, ds, isTaken);
				ds.remove(ds.size() - 1);
				isTaken[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] isTaken = new boolean[nums.length];
		getAllPermutation(nums, result, ds, isTaken);
		// print all permutation
		System.out.println("result size is :" + result);
	}

}
