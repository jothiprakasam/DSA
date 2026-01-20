package dsa;
import java.util.*;
public class Leetcode_594 {

	public static void main(String[] args) {
		int[] nums = {1,1,1,1};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i =0;i<nums.length;i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
		int ll=0;
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			int val = entry.getKey();
			if(hm.containsKey(val+1)) {
				ll = Math.max(ll,entry.getValue() + hm.get(val+1));
			}
		}
		System.out.println(ll);
	}
}
