package dsa.SlidingWindow;
// WRONG APPROACH OR NEED TO BE WORK 
public class Leetcode_3411 {
	static int gcd(int a,int b) {
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	static int gcdArray(int[] arr) {
		int res = arr[0];
		for(int i =1;i<arr.length;i++) {
			res = gcd(res,arr[i]);
			if(res==1)
				return 1; //optimization
		}
		return res;
	}
	static int lcmArray(int[] arr) {
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			int currgcd = gcd(res,arr[i]);
			res = Math.abs((res/currgcd)*arr[i]);
		}
		return res;
	}
	static int prod(int[] arr) {
		int res =arr[0];
		for(int i=1;i<arr.length;i++) {
			res=res*arr[i];
			if(res==0)
				return 0;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,2,1,1,1};
		int l=0;
		int llen = Integer.MIN_VALUE;
		for(int r=0;r<nums.length;r++) {
			int[] arr = new int[r-l+1];
			for(int j=l;j<=r;j++)
				arr[j]=arr[j];
			while(prod(arr)!=(lcmArray(arr)*gcdArray(arr))) {
				l++;
			}
			llen=Math.max(llen,r-l+1);
		}
		System.out.println(llen);
	}

}
