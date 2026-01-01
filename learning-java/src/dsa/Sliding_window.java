package dsa;

public class Sliding_window {
	public static void main(String args[]) {
		int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		int start = 0;
		int end = k-1;
		int maxsum = 0;
		int winsum = 0;
		for(int i =start;i<=end;i++) {
			winsum+=arr[i];
		}
		maxsum = winsum;
		for(int i =1;i<=k;i++) {
			start++; end++;
			winsum = winsum - arr[start-1] + arr[end];
			if(winsum>maxsum)
				maxsum = winsum;
		}
		
		System.out.println(maxsum);
	}
}
