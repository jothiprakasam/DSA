package dsa.array;

public class Second_largest_2 {

	public static void main(String[] args) {
		int[] arr = {3,2,2,3,1,4};
		int largest = Integer.MIN_VALUE;
		// first loop - O(N)
		for(int i =0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		// second loop - O(N)
		int second_largest = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] < largest && arr[i] > second_largest) {
				second_largest = arr[i];
			}
		}
		System.out.println(second_largest);
	}

}
