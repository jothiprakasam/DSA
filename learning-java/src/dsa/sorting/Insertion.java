package dsa.sorting;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,-1,5,6,4,3};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i-1;j++) {
				if(arr[j]>=arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
