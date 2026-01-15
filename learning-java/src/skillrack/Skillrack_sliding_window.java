package skillrack;

public class Skillrack_sliding_window {

	public static void main(String[] args) {
		int[] arr = {2,1,6,4,6,7,3,3,1,4};
		int k = 3;
		int n = arr.length;
		int large = Integer.MIN_VALUE;
		int small = arr[0];
		for(int i = 0;i<k;i++) {
			if(arr[i]>small)
				small=arr[i];
		}
		
		for(int i =1;i<=n-k;i++) {
			
			for(int j = i;j<=i+k-1;j++) {
				if(arr[j]>large)
					large = arr[j];
			}
			if(large<small) {
				small=large;
			}
			//System.out.println(small);
			large=Integer.MIN_VALUE;
		}
		System.out.println(small);
	}

}
