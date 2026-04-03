package dsa.kadanes;

public class Leetcode_53 {

	public static void main(String[] args) {
		/*
		int sum = 0;
		int maxSum = 0;
		int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
		for(int a : arr) {
			sum += a;
			if(sum<0) {
				sum=0;
			}
			maxSum = Math.max(sum, maxSum);
		}
		*/
		int[] nums  =  {-2,1,-3,4,-1,2,1,-5,4};
		int currSum = nums[0];
		int maxSum = nums[0];
		for(int i=1;i<nums .length;i++) {
			currSum = Math.max(nums[i], currSum+nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		System.out.println(maxSum);
	}

}
