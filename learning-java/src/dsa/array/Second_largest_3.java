package dsa.array;

public class Second_largest_3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int f_large = 0;
		int s_large = -1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>arr[f_large]) {
				s_large=f_large;
				f_large = i;
			} else {
				if(s_large==-1 || arr[i]>arr[s_large])
					s_large = i;
			}
		}
		System.out.println(arr[s_large]);
	}

}
