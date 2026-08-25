package dsa.dp;

/** 
 *  using recursion not memoization
 *  CanSum(array,target) 
 * 	using the array of elements make the sum.
 *  can use the same element any number of time.
 **/

public class CanSum {
	static int cnt = 0;
	public static void main(String[] args) {
		int[] arr = {5,3,4,7};
		int target = 7; 
		boolean result = cansum(target,arr);
		System.out.println(CanSum.cnt++);
	}
	public static boolean cansum(int target, int[] arr) {
		CanSum.cnt++;
		if(target==0) return true;
		boolean res = false;
		for(int a: arr) {
			if(a<=target)
				res = res || cansum(target-a,arr);	
		}
		return res;
	}
}
