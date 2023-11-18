package com.leetcode;

/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.*/

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPallindrome(12216));

	}
	
	public static boolean isPallindrome(int x) {
		
		if (x < 0)
		      return false;

		    long reversed = 0;
		    int y = x;

		    while (y > 0) {
		      reversed = reversed * 10 + y % 10;
		      y /= 10;
		    }

		    return reversed == x;
		  }
	}


