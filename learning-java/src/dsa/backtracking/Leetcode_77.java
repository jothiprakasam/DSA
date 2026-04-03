package dsa.backtracking;
import java.util.*;
// combination 
public class Leetcode_77 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		List<List<Integer>> result = new ArrayList<>();
		int start = 0;
		backtrack(result,new ArrayList<>(),nums,start);
		System.out.println(result);
	}
	public static void backtrack(List<List<Integer>> result,List<Integer> templist,int[] nums,int start) {
		// base condition
		if(templist.size()==2) {
			result.add(new ArrayList<>(templist));
			return;
		}
		for(int i=start;i<nums.length;i++) {
			start++;
			templist.add(nums[i]);
			backtrack(result,templist,nums,start);
			templist.remove(templist.size()-1);
		}
	}
}
