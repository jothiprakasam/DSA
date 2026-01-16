package dsa;

public class Leetcode_209 {

	public static void main(String[] args) {
		int target = 4;
		int[] nums = {1,4,4};
		int ans = Integer.MAX_VALUE;
		int l=0,r=0;
		int sum=0;
		for(r =0;r<nums.length;r++) {
			sum+=nums[r];
			while(sum>=target) {
				ans = Math.min(ans, r-l+1);
				sum-=nums[l];
				l++;
			}
			//ans = Math.min(ans, r-l+1);
		}
		System.out.println(ans>=Integer.MAX_VALUE?0:ans);
	}
}
