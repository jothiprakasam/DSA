package dsa;

public class Leetcode_643 {

	public static void main(String[] args) {
		int[] nums= {1,12,-5,-6,50,3};
		int k =4;
		int n = nums.length;
		double winsum=0;
		double max = Float.MIN_VALUE;
		for(int i =0;i<k;i++) {
			winsum+=nums[i];
		}
		max = winsum;
		for(int i=k;i<n;i++) {
			winsum+= nums[i]-nums[i-k];
			max=Math.max(max, winsum);
		}
		System.out.print(max/k);
	}
}
