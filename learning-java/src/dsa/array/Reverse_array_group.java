package dsa.array;

public class Reverse_array_group {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int k = 3;
		int n = arr.length;
		int left,right;
		for(int i=0;i<n;i+=k) {
			left = i;
			right = Math.min(i+k-1, n-1);
			while(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
