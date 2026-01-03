package dsa;
import java.util.*;
// This code solves the problem from leetcode 
// 2461. Maximum Sum of Distinct Subarrays With Length K
public class Sliding_window_distinct {

	public static void main(String[] args) {
		int[] arr = {100000, 100000, 99999};
		HashMap<Integer,Integer> hm = new HashMap<>();
		int k = 2;
		int winsum = 0;
		int maxsum = 0;
		//calculating first window size
		for(int i = 0;i<k;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			winsum += arr[i];
		}
		//check for distinct condition
		if(hm.size() == k)
			maxsum =  winsum;	
		
		for(int i =k;i<=arr.length-1;i++) {
			// can also use start and end pointers, but efficient method is to 
			// slide the window to k to length - 1 and point previous using i-k
			int previous = i-k;
			//adding new elements
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			hm.put(arr[previous], hm.getOrDefault(arr[previous],0)-1);
			// remove the previous element by checking if it has frequency
			if(hm.get(arr[previous])==0) {
				hm.remove(arr[previous]);
			}
			winsum += arr[i] - arr[previous];
			if((hm.size()==k) && (maxsum < winsum))
				maxsum = winsum;
		}
		System.out.println(maxsum);
	}

}
