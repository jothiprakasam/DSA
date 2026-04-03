package dsa.backtracking;
import java.util.*;
public class Leetcode_46 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result,new ArrayList<>(),nums);
		System.out.println(result);
	}
	public static void backtrack(List<List<Integer>> result,List<Integer> templist,int[] nums) {
		// base condition
		if(templist.size()==nums.length) {
			result.add(new ArrayList<>(templist));
			return;
		}
		
		for(int number:nums) {
			if(templist.contains(number))
				continue;
			templist.add(number);
			backtrack(result,templist,nums);
			templist.remove(templist.size()-1);
		}
	}
}
