package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1200 {

	public static void main(String[] args) {
		int arr[] = {1,3,6,10,15};
		Arrays.sort(arr);
		List<List<Integer>> ls = new ArrayList<>();
		
		int min_diff = Integer.MAX_VALUE;
		int curr_diff =0;
		for(int i =0;i<arr.length-1;i++) {
			curr_diff = arr[i+1]-arr[i];
			if(curr_diff<min_diff) {
				ls.clear();
				min_diff = curr_diff;
				ls.add(Arrays.asList(arr[i],arr[i+1]));
			} else if(curr_diff==min_diff)
				ls.add(Arrays.asList(arr[i],arr[i+1]));
		}
		for(List<Integer> l:ls)
			System.out.println(l);
	}
}
