package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = twoSum(new int[] { 7, 6, 3, 5, 2 }, 9);
		System.out.println(result[0] + " " + result[1]);

	}

	public static int[] twoSum(int[] nums, int target) {

		if (nums == null || nums.length < 2) {

			throw new IllegalArgumentException("Invalid values provided");
		}

		Map<Integer, Integer> trackerMap = new HashMap();

		for (int i = 0; i < nums.length; i++) {

			int remaining = target - nums[i];

			if (trackerMap.containsKey(remaining)) {
				return new int[] { trackerMap.get(remaining), i };
			} else {
				trackerMap.put(nums[i], i);
			}

		}

		return new int[] { -1, -1 };
	}

}
