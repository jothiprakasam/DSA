package dsa.SlidingWindow;

public class Leetcode_3364 {

	public static void main(String[] args) {
		int[] nums = {3,-2,1,4};
		int l =2,r=3;
		int res=Integer.MAX_VALUE;
		boolean isfound = false;
		for(int i =0;i<nums.length-r;i++) {
			int winsum = 0;
			for(int j =i;j<nums.length;j++) {
				winsum += nums[j];
				int len = j-i+1;
				if(len<=r && len>=l) {
					if(winsum>0) {
						res = Math.min(res, winsum);
						isfound=true;
					}
				}
			}
		}
		System.out.println(isfound?res:-1);
	}

}
