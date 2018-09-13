package com.practise.problems.array;

import java.util.Arrays;

/**
 * Rearrange an array in order – largest, 2nd smallest, 2nd largest
 * 
 * @author seshshan
 *
 */
public class MeandaringArray {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
		int len = arr.length;

		Arrays.sort(arr);// N log N

		arr = rearrangeArray(arr, len); // N, N log N + N = N log N and space
										// O(N)

		System.out.println("\n..Meandaring Array..");
		for (int item : arr)
			System.out.print(" " + item);

	}

	private static int[] rearrangeArray(int[] arr, int len) {
		int tmpArray[] = new int[arr.length];

		// iterate from both ends
		int mid = len / 2;
		// for(int i=len-1,j=0,k=0;i>=mid && j<mid && k<len;i--,j++)
		for (int k = 0, i = len - 1, j = 0; k < len;) {
			// put large item first

			if (k < len)
				tmpArray[k++] = arr[j];

			if (k < len)
				tmpArray[k++] = arr[i];

			if (j < mid)
				j++;
			if (i >= mid)
				i--;

		}
		return tmpArray;
	}

}
