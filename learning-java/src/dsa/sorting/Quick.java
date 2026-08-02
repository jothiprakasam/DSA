package dsa.sorting;

import java.util.Arrays;

public class Quick {
	public static void swap(int a,int b,int[] arr) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void sort(int[] arr,int l,int h) {
		if(l>=h)
			return;
		int pivot = pattern(arr,l,h);
		sort(arr,l,pivot-1);
		sort(arr,pivot+1,h);
	}
	public static int pattern(int[] arr,int l,int h) {
		int pivot =arr[l];
		int i=l+1;
		int j=h;
		while(i<=j) {
			while(i<=h && arr[i]<pivot)
				i++;
			while(j>=l+1 && arr[j]>=pivot)
				j--;
			if(i<j)
				swap(i,j,arr);
		}
		swap(j,l,arr);
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,-1,3,5};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
