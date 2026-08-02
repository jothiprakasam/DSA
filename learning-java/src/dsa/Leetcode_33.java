package dsa;

public class Leetcode_33 {
	public static int bin_s(int[] nums,int l,int r,int target) {
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]<target)
				l=mid+1;
			else r=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1};
		int l = 0,ans = Integer.MIN_VALUE;
		int r = nums.length-1;
		int target = 3;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(nums[mid]>nums[r])
				l=mid+1;
			else if(nums[mid]<=nums[r]){
				ans=mid;
				r=mid-1;
			}
		}
		int result = -1;
		if(nums[ans]<target) {
			result = bin_s(nums,ans,nums.length-1,target);
		}else
			result = bin_s(nums,0,ans-1,target);
		System.out.println(result);
	}

}
