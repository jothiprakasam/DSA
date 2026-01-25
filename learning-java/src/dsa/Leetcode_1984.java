package dsa;

import java.util.Arrays;

public class Leetcode_1984 {
	public static void main(String args[]) {
		int arr[] = {9,4,1,7};
		int k = 2;
		Arrays.sort(arr);
		int min_diff = arr[k-1]-arr[0];
		for(int i=k;i<arr.length;i++) {
			min_diff = Math.min(min_diff, arr[i]-arr[i-k+1]);
		}
		System.out.println(min_diff);
	}
}

