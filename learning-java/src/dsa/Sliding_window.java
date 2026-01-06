package dsa;

public class Sliding_window {
	public static void main(String args[]) {
		int[] arr = {100,200,300,400};
		int k = 2;
		int maxsum = 0;
		int winsum = 0;
		for(int i =0;i<k;i++) {
			winsum+=arr[i];
		}
		maxsum = winsum;
		for(int i = k;i<arr.length;i++) {
			// arr[i-k] -> previous which is start element of window - 1
			// arr[i] -> current window end element
			winsum = winsum - arr[i-k] + arr[i];
			if(winsum>maxsum)
				maxsum = winsum;
		}
		System.out.println(maxsum);
	}
}
