package dsa.sorting;

import java.util.Arrays;

public class Merge_Sort {

	public static void merge_sort(int[] arr,int n) {
		//base condition
		if(n<2)
			return;
		int mid = n/2;
		int[] leftarr = new int[mid];
		int[] rightarr = new int[n-mid];
		for(int i=0;i<mid;i++)
			leftarr[i]=arr[i];
		for(int i=mid;i<n;i++)
			rightarr[i-mid]=arr[i];
		merge_sort(leftarr,mid);
		merge_sort(rightarr,n-mid);
		
		merge(arr,leftarr,rightarr,mid,n-mid);
	}
	public static void merge(int[] arr,int[] leftarr,int[] rightarr,int left,int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				k++; i++;
			}else
				arr[k++]=rightarr[j++];
		}
		while(i<left) {
			arr[k++]=leftarr[i++];
		}
		while(j<right) {
			arr[k++]=rightarr[j++];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,10,2,3,7,4};
		merge_sort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
