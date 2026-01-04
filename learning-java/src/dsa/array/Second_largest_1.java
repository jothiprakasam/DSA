package dsa.array;

import java.util.Arrays;

public class Second_largest_1 {
	// approach 1 - O(nlogn)
	public static void main(String[] args) {
		int[] arr = {3,2,2,3,1};
		Arrays.sort(arr); // - in built quick sort O(log n)
		int n = arr.length;
		int second_largest = 0;
		for(int i =n-2;i>=0;i--) {
			if(arr[i] != arr[n-1]) {
				second_largest = arr[i];
				break; // important thing
			}
		}
		System.out.println(second_largest);
	}
}
