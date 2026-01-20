package dsa;

public class Leetcode_1752 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int n = arr.length;
		int break_point = 0;
		for(int i = 1;i<n;i++) {
			if(arr[i-1]>arr[i]) {
				break_point++;
			}
			System.out.println(break_point);
		}
		if(arr[n-1]>arr[0])
			break_point++;
		if(break_point>=2)
		System.out.println(false);
		else
		System.out.println(true);	
	}

}
